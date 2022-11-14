package via.sep3.databaseserver.shared;

public class Response {
    private Object object;

    public Response(){
        this.object = null;
    }

    public Response(Object o){
        this.object = o;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }
}
