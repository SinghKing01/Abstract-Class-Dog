class MaxEnergy extends Exception {

}

class NegativeEnergy extends Exception{
    String msg;

    NegativeEnergy(String msg){
        this.msg = msg;
    }

    @Override
    public String toString() {
        return msg;
    }
}
