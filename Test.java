import java.sql.Date;

public class Test {
    public static void main(String[] args) {
////        try{
////            String json="{\"sysCd\":\"1\",\"userId\":\"20185\",\"password\":\"\",\"name\":\"测试5\",\"sex\":\"\",\"birthdayYear\":\"\",\"birthdayMonth\":\"\",\"birthdayDay\":\"\",\"avatarImgGclub\":\"\",\"avatarImgIclub\":\"\",\"addressProvince\":\"\",\"addressCity\":\"\",\"addressDetail\":\"\",\"dealerCode\":\"\",\"drivingLicenseExpiryDate\":\"\",\"apiRegister\":\"\",\"registDateGclub\":\"\",\"registDateIclub\":\"\",\"wxCode\":\"\",\"nickName\":\"\",\"userType\":\"\",\"identityCard\":\"\",\"recommendedName\":\"\",\"registFromType\":\"\",\"registFromCd\":\"\",\"status\":\"\",\"loginCountIclub\":\"\",\"lastLoginDateIclub\":\"\",\"loginFailCountIclub\":\"\",\"loginCountGclub\":\"\",\"lastLoginDateGclub\":\"\",\"loginFailCountGclub\":\"\",\"deviceId\":\"\",\"appVersion\":\"\",\"appOsType\":\"\",\"activeFlag\":\"\",\"fromSystemCode\":\"011\",\"toSystemCode\":\"999\",\"messagId\":\"10000\",\"chgSourceSys\":\"\"}";
////        URL url = new URL("http://127.0.0.1:8080/gtms-ap/ap/sendAppUserInfo.do");
////        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
////       System.out.println("创建链接成功：" + conn.getURL());
////        conn.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
////        conn.setDoOutput(true);
////        conn.setDoInput(true);
////        conn.setRequestMethod("POST");
////        conn.setUseCaches(false);
////        conn.setInstanceFollowRedirects(true);
////        conn.connect();
////        System.out.println("获取链接成功。");
////        DataOutputStream out = new DataOutputStream(conn.getOutputStream());
////        JSONObject obj = new JSONObject();
////        obj.element("sysCd", "2");
////        obj.element("userId", "1");//password
////        obj.element("password", "1");
////        out.write(json.getBytes("UTF-8"));
////        System.out.println("数据写入成功：" + obj.toString());
////        out.flush();
////        // 读取响应
////        BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));
////        String lines;
////        StringBuffer sb = new StringBuffer("");
////        while ((lines = rd.readLine()) != null) {
////            lines = new String(lines.getBytes());
////            sb.append(lines);
////        }
////        System.out.println("APP会员积分信息返回结果:" + sb.toString());
////        out.close();
////        conn.disconnect();
////        }catch(Exception e){
////            System.out.println(e.getMessage());
////            System.out.println(e.getStackTrace());
////        }
////        shenk a=new shenk();
////        System.out.println(a instanceof shenk);
////        System.out.println(a instanceof Person);
//       System.out.println(System.currentTimeMillis());
//       java.sql.Date date=Test.valueOf("12345-12-12");
////       SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy/MM/dd");
//       System.out.println(toString1());
        System.out.println("".matches("[0-9]{0,20}"));
    }
    public static Date valueOf(String s) {
        final int YEAR_LENGTH = 5;
        final int MONTH_LENGTH = 2;
        final int DAY_LENGTH = 2;
        final int MAX_MONTH = 12;
        final int MAX_DAY = 31;
        int firstDash;
        int secondDash;
        Date d = null;

        if (s == null) {
            throw new java.lang.IllegalArgumentException();
        }

        firstDash = s.indexOf('-');
        secondDash = s.indexOf('-', firstDash + 1);

        if ((firstDash > 0) && (secondDash > 0) && (secondDash < s.length() - 1)) {
            String yyyy = s.substring(0, firstDash);
            String mm = s.substring(firstDash + 1, secondDash);
            String dd = s.substring(secondDash + 1);
            if (yyyy.length() == YEAR_LENGTH &&
                    (mm.length() >= 1 && mm.length() <= MONTH_LENGTH) &&
                    (dd.length() >= 1 && dd.length() <= DAY_LENGTH)) {
                int year = Integer.parseInt(yyyy);
                int month = Integer.parseInt(mm);
                int day = Integer.parseInt(dd);

                if ((month >= 1 && month <= MAX_MONTH) && (day >= 1 && day <= MAX_DAY)) {
                    d = new Date(year - 1900, month - 1, day);
                }
            }
        }
        if (d == null) {
            throw new java.lang.IllegalArgumentException();
        }

        return d;

    }
    public static String toString1 () {
        int year = 12345 + 1900;
        int month = 12 + 1;
        int day = 12;

        char buf[] = "2000-00-00".toCharArray();
        buf[0] = forDigit(year/1000,10);
        buf[1] = forDigit((year/100)%10,10);
        buf[2] = forDigit((year/10)%10,10);
        buf[3] = forDigit(year%10,10);
        buf[5] = forDigit(month/10,10);
        buf[6] = forDigit(month%10,10);
        buf[8] = forDigit(day/10,10);
        buf[9] = forDigit(day%10,10);

        return new String(buf);
    }
    public static char forDigit(int digit, int radix) {
        if ((digit >= radix) || (digit < 0)) {
            return '\0';
        }
        if ((radix < Character.MIN_RADIX) || (radix > Character.MAX_RADIX)) {
            return '\0';
        }
        if (digit < 10) {
            return (char)('0' + digit);
        }
        return (char)('a' - 10 + digit);
    }
}

class Person {

}

class shenk extends Person{
    
}
