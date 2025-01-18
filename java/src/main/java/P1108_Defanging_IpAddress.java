public class P1108_Defanging_IpAddress {

    public static void main(String args[]) {
        var address = "1.1.1.1";
        System.out.println(new P1108_Defanging_IpAddress().defangIPaddr(address));
    }

    public String defangIPaddr(String address) {

        address = address.replace(".", "[.]");
        return address;

    }

}
