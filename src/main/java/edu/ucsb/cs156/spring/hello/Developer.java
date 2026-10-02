package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
        

        return "Declan";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        
        return "declanhogg100";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        // TODO: Change this to your team name
        Team team = new Team("f26-03");
        team.addMember("DECLAN MICHAEL ZUBERI");
        team.addMember("CODY WILLIAM");
        team.addMember("BRANDON MATTHEW");
        team.addMember("JUNXI");
        team.addMember("XIANZE");
        team.addMember("PHILIP");
        
        return team;
    }
}
