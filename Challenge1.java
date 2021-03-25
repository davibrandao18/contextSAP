public void ConcatNContextToOnString(
    String[] info,
    String[] nome,
    String[] age,
    String[] cpf,
    ResultList result,
    Container container) throws StreamTransformationException{
    String name_list = "";
    //AbstractTrace trace;
    //trace = container.getTrace();
    try{
        for (int i = 0 ; i < info.length ; i++) {
            name_list = name_list + nome[i] ;
            // -- Concatenando todas as informações na string --//
            //name_list = name_list + nome[i] + "," + age[i] + "," + cpf[i] ;
            if ( i+1 < info.length ) {
                name_list = name_list + ";"  ;
            }
        }
        result.addValue (name_list);
    } catch(Exception e) {
        //trace.addInfo();
        e.printStackTrace();
    }
}