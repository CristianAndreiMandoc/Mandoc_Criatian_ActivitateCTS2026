package builder.main;

import builder.classes.IBuilder;
import builder.classes.PachetTransport;
import builder.classes.PachetTransportBuilder;
import com.sun.security.jgss.GSSUtil;

public class Main {
    public static void main(String[] args) {
        IBuilder builder = new PachetTransportBuilder();

        PachetTransport pachet1 = ((PachetTransportBuilder)builder).setAreWifi(true).setAreTV(true).build();
        System.out.println(pachet1);


    }
}
