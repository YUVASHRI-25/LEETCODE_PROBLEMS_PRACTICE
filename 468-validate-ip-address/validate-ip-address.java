
class Solution {
    public String validIPAddress(String queryIP) {

        if (queryIP.indexOf('.') != -1) {
            String[] parts = queryIP.split("\\.", -1);

            if (parts.length != 4) {
                return "Neither";
            }

            for (int i = 0; i < parts.length; i++) {
                String s = parts[i];

                if (s.length() == 0 || s.length() > 3) {
                    return "Neither";
                }

                if (s.length() > 1 && s.charAt(0) == '0') {
                    return "Neither";
                }

                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) < '0' || s.charAt(j) > '9') {
                        return "Neither";
                    }
                }

                int num = Integer.parseInt(s);

                if (num > 255) {
                    return "Neither";
                }
            }

            return "IPv4";
        }

        else if (queryIP.indexOf(':') != -1) {
            String[] parts = queryIP.split(":", -1);

            if (parts.length != 8) {
                return "Neither";
            }

            for (int i = 0; i < parts.length; i++) {
                String s = parts[i];

                if (s.length() == 0 || s.length() > 4) {
                    return "Neither";
                }

                for (int j = 0; j < s.length(); j++) {
                    char ch = s.charAt(j);

                    if (!((ch >= '0' && ch <= '9') ||
                          (ch >= 'a' && ch <= 'f') ||
                          (ch >= 'A' && ch <= 'F'))) {
                        return "Neither";
                    }
                }
            }

            return "IPv6";
        }

        return "Neither";
    }
}
