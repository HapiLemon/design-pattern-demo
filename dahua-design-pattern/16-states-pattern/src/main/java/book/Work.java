package book;

import lombok.Data;
import book.state.State;

/**
 * @author keminfeng
 * @date 2022-03-07 17:13
 */
@Data
public class Work {
    
    private int hour;

    private State state;

    private boolean finish;

    public void writeProgram() {
        this.state.writeProgram(this);
    }
}
