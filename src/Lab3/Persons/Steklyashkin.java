package Lab3.Persons;

import Lab3.Objects.Telescope;
import static Lab3.Persons.PersonState.STARING_INTO_TELESCOPE;

public class Steklyashkin extends Person {
    public Steklyashkin(Mood mood, PersonState state) {
        super("Steklyashkin", 0, mood, state);
    }
    private Telescope Telescope;
    public Telescope getTelescope() {
        return this.Telescope;
    }
    // look at other person through the telescope and occupy the telescope by yourself
    public void lookAt(Telescope telescope, Person person) {
        this.setState(STARING_INTO_TELESCOPE);
        if (this.getState() == STARING_INTO_TELESCOPE) {
            this.Telescope = telescope;
            this.setMood(Mood.CURIOUS);

            System.out.println("Steklyashkin is staring into " + person.getName() + " through the telescope");
        }
        else {
            System.out.println("Steklyashkin can't do this while he is " + this.getState());
        }
    }
}