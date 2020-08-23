package com.kodilla.stream.forum;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public final class ForumUser {
    private final String username;
    private final String realName;
    private final String location;
    private final Set<ForumUser> friends = new HashSet<>();

    public ForumUser(final String username, final String realName, final String location) {
        this.username = username;
        this.realName = realName;
        this.location = location;
    }

    public void addFriend(ForumUser user){
        friends.add(user);
    }

    public boolean removeFriend(ForumUser user){
        return friends.remove(user);
    }

//String, bo zamieniam w strumieniu ForumUser na String (przez .map), getLocation jest String
// Zwraca Set będący listą lokalizacji przyjaciów (location)

    public Set<String> getLocationsOfFriends(){
        return friends.stream()                 // tworzę strumień na kolekcji friends (Set <ForumUser)
                .map(friend->friend.getLocation()) //zamieniam obiekty z ForumUser na String
                .collect(Collectors.toSet());      // terminal - wynik -> kolekcja
    }


    public Set<String> getLocationsOfFriendsOfFriends(){
        return friends.stream()

//dla każdego user pobieram listę przyjaciów (.getFriends) i przekazuję do dalszego przetwarzania
//w postaci nowego stream -- .stream()
// od tego momentu pracuję na liście „przyjaciół przyjaciół”

                .flatMap(user -> user.getFriends().stream())
                .filter(user -> user !=this)   //filtruję, wykluczam odwołania do samego siebie
                                                //gdy zwraca TRUE to obiekt ma przejść przez filtr
                .map(ForumUser::getLocation)   //transformuje z typu obiektów ForumUser na String
                                                // - lokalizacje użytkowników ->.getLocation()
                .collect(Collectors.toSet());  //terminal - zwraca kolekcję Set
    }

    public String getUsername() {
        return username;
    }

    public String getRealName() {
        return realName;
    }

    public String getLocation() {
        return location;
    }

    public Set<ForumUser> getFriends() {
        return friends;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "username='" + username + '\'' +
                ", realName='" + realName + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForumUser)) return false;

        ForumUser forumUser = (ForumUser) o;

        return getUsername().equals(forumUser.getUsername());
    }

    @Override
    public int hashCode() {
        return getUsername().hashCode();
    }

}
