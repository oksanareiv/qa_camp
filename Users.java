public enum Users {
    QA_ENGINEER("qa_engineer", "101120"),
    DEVELOPER ("developer", "203111"),
    PM("pm", "435671");

    private String name;
    private String pass;
    Users(final String name, final String pass){
        this.name = name;
        this.pass = pass;
    }

    public static void main(String [] args){
                Users users = Users.DEVELOPER;
        System.out.println(users.name + " ");
        System.out.println(users.pass + " ");
    }
}
