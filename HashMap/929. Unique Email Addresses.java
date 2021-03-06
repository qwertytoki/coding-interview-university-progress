class Solution {
    public int numUniqueEmails(String[] emails) {
        // replaceAll : replace by using regex
        // replace : replace without using regex

        // split : using regex, so use escape when you want to split []-.+*?()|^$
        Set<String> set = new HashSet<>();
        for(String email:emails){
            String[] splittedEmail = email.split("@",0);
            String convertedEmail = splittedEmail[0].split("\\+",0)[0];
            convertedEmail = convertedEmail.replace(".","");
            convertedEmail = convertedEmail +"@"+ splittedEmail[1];
            System.out.println(convertedEmail);
            set.add(convertedEmail);
        }
        
        return set.size();
    }
}