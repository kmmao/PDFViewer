package zju.homework.pdfviewer.Java;

/**
 * Created by stardust on 2016/11/17.
 */

public class Group {

    private String id;

    private String pdfData;

    private String fileName;

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    private String creator;

    public Group(String id, String data, String name, String c){
        this.id = id;
        pdfData = data;
        fileName = name;
        creator = c;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPdfData() {
        return pdfData;
    }

    public void setPdfData(String pdfData) {
        this.pdfData = pdfData;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}