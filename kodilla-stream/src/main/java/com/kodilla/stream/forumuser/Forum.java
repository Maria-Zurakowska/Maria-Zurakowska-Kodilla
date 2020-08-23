package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> forumUsersList = new ArrayList<>();

    public Forum(){
        forumUsersList.add(new ForumUser(4364, "mnowak", 'M',50,1987,10,11));
        forumUsersList.add(new ForumUser(7543, "akowal",'M',100,1965,9,5));
        forumUsersList.add(new ForumUser(3968, "radamowicz", 'M',20,1999,4,3));
        forumUsersList.add(new ForumUser(2405, "kadamczyk", 'F',300,1976,12,30));
        forumUsersList.add(new ForumUser(1839, "wpiwot",'F',346,1980,7,12));
        forumUsersList.add(new ForumUser(9483, "mnowakowska",'F',222,1969,8,26));
    }

     public List<ForumUser> getUserList(){
         return new ArrayList<>(forumUsersList);
     }


}
