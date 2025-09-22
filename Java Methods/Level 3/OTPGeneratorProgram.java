import java.util.HashSet;

public class OTPGeneratorProgram {
    public static void main(String[] args) {
        int[] otps = new int[10];
        
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
        }
        
        System.out.print("Generated OTPs: ");
        for (int otp : otps) System.out.print(otp + " ");
        System.out.println();
        
        System.out.println("All OTPs are unique: " + areOTPsUnique(otps));
    }
    
    public static int generateOTP() {
        return (int)(Math.random() * 900000) + 100000;
    }
    
    public static boolean areOTPsUnique(int[] otps) {
        HashSet<Integer> set = new HashSet<>();
        for (int otp : otps) {
            if (!set.add(otp)) return false;
        }
        return true;
    }
}