package com.mstar.dragdropsample3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mstar on 02-28-2022.
 */

public class UsersData {

    private final List<User> usersList = new ArrayList<User>() {
        {
            add(new User(0, "", "", "Developers", 0));
            add(new User(1, "Frederick Hoffman", "https://randomuser.me/api/portraits/men/52.jpg", "Developers", 1));
            add(new User(2, "Calvin Young", "https://randomuser.me/api/portraits/men/78.jpg", "Developers", 1));
            add(new User(3, "Jeanette Reid", "https://randomuser.me/api/portraits/women/37.jpg", "Developers",1));
            add(new User(4, "Flenn Wilson", "https://randomuser.me/api/portraits/men/40.jpg", "Developers", 0));
            add(new User(5, "Martin Holland", "https://randomuser.me/api/portraits/men/0.jpg", "Developers", 0));
            add(new User(6, "", "", "Designers", 0));
            add(new User(7, "Jeanette Simmmons", "https://randomuser.me/api/portraits/women/3.jpg", "Designers", 0));
            add(new User(8, "Wallace Lambert", "https://randomuser.me/api/portraits/men/53.jpg", "Designers", 0));
            add(new User(9, "Andy Clark", "https://randomuser.me/api/portraits/men/68.jpg", "Designers", 0));
            add(new User(10, "olivia obrien", "https://randomuser.me/api/portraits/women/93.jpg", "Designers", 0));
            add(new User(11, "Debbie Bennett", "https://randomuser.me/api/portraits/women/34.jpg", "Designers", 0));
            add(new User(12, "", "", "Team Leads", 0));
            add(new User(13, "Bernice Lawson", "https://randomuser.me/api/portraits/women/20.jpg", "Team Leads", 0));
            add(new User(14, "Camila Elliott", "https://randomuser.me/api/portraits/women/60.jpg", "Team Leads", 0));
            add(new User(15, "Gerald Webb", "https://randomuser.me/api/portraits/men/55.jpg", "Team Leads", 0));
            add(new User(16, "Russell Hart", "https://randomuser.me/api/portraits/men/18.jpg", "Team Leads", 0));
            add(new User(17, "Joyce Mccoy", "https://randomuser.me/api/portraits/women/82.jpg", "Team Leads", 0));
            add(new User(18, "", "", "Team Managers", 0));
            add(new User(19, "Daryl Banks", "https://randomuser.me/api/portraits/men/4.jpg", "Team Managers", 0));
            add(new User(20, "Veronica Vargas", "https://randomuser.me/api/portraits/women/14.jpg", "Team Managers", 0));
            add(new User(21, "Natalie Jacobs", "https://randomuser.me/api/portraits/women/0.jpg", "Team Managers", 0));
            add(new User(22, "Beverly Kennedy", "https://randomuser.me/api/portraits/women/30.jpg", "Team Managers", 0));
        }
    };

    public List<User> getUsersList() {
        return usersList;
    }
}
