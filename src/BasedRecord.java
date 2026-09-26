public abstract class BasedRecord implements FileRecord {

    protected String id;

    public BasedRecord(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public abstract String toFileString();
}