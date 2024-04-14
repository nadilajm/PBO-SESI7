public class Mahasiswa <I,N,K> {
    private I nim;
    private N name;
    private K clas;

    public I getNim() {
        return nim;
    }
    public void setNim(I nim){
        this.nim = nim;
    }
    
    public N getName() {
        return name;
    }
    public void setName(N name){
        this.name = name;
    }
    
    public K getClas() {
        return clas;
    }
    public void setClas(K clas){
        this.clas = clas;
    }
    
}
