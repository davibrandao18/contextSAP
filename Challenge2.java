public void Concat_Contact_TO_Contact_List(
    String[] row, 
    String[] name,
    String[] phone, 
    String[] email, 
    ResultList result, 
    Container container) 
    throws StreamTransformationException{
    String contact_list = "";
    int n = 0;
    /*AbstractTrace trace;
    trace = container.getTrace();*/
    try{
        for (int i = 0 ; i < row.length ; i++) {
            if (name[i].equals(ResultList.CC)) {
                i++;
            } else {
                contact_list = contact_list + name[i] ;
                contact_list =  contact_list + "," ;
                for (int j = n; j < email.length ; j++) {
                    if (email[j].equals(ResultList.CC)) {
                        n = j + 1;
                        break;           
                    } else {
                        contact_list = contact_list + phone[j] ;
                        contact_list =  contact_list + "," ;
                        contact_list = contact_list + email[j] ;
                        if ( email.length > j+1 && !email[j+1].equals(ResultList.CC) ) {
                            contact_list =  contact_list + ","  ;
                        }
                    } 
                }
            }
            if ( i+1 < row.length ) {
            contact_list =  contact_list + ";"  ;
            }
        }
        result.addValue (contact_list);
    } catch(Exception e) {
        //trace.addInfo();
        e.printStackTrace();
    }
}