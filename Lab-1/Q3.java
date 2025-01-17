public class SmartHome {
    public static void main(String[] args) {
        int lights = 0b000; // All lights are initially OFF

        // Turn ON Light 1
        lights |= 0b001;

        // Check if Light 2 is ON or OFF
        String light2Status = ((lights & 0b010) != 0) ? "Light 2 is ON" : "Light 2 is OFF";
        System.out.println(light2Status);

        // Turn OFF Light 3
        lights &= ~0b100;

        // Display the final state of all lights in binary format
        System.out.println("Final state of lights: " + Integer.toBinaryString(lights));
    }
}

/*
Sample Output:
Light 2 is OFF
Final state of lights: 1
*/
