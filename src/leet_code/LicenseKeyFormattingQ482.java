package leet_code;

public class LicenseKeyFormattingQ482 {

	public static void main(String[] args) {
		LicenseKeyFormattingQ482 licenseKeyFormattingQ482 = new LicenseKeyFormattingQ482();
		System.out.println(licenseKeyFormattingQ482.licenseKeyFormatting("Hello-Wo-Rl-d", 3));
	}
	public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        s = s.toUpperCase().replace("-","");
        for(int i = s.length()-1;i>=0;i--){
            if(count == k){
                count = 0;
                sb = sb.append("-");
            }
            sb = sb.append(s.charAt(i));
            count++;
        }
        return sb.reverse().toString();
    }
}
