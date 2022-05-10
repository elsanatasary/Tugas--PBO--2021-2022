class Beruang {
    private static String jenis_unggas = "beruang";
    private static int jumlah_kaki = 2;
    
    public static String getJenisUnggas(){
		return jenis_unggas;
	}
	
	public static int getJumlahKaki(){
		return jumlah_kaki;
	}
	
	private static void weeeeeee(){
		System.out.println("aku weeeee");
	}
	
	private static void melahirkan(){
		System.out.println("aku melahirkan");
	}
	
	private static void jalan(){
		System.out.println("aku jalan");
	}
	
	public static void main(String [] args){
		System.out.println(
		String.format("Jenis unggas:%s",getJenisUnggas())
		);
		System.out.println(
		String.format("Jumlah kaki:%s",getJumlahKaki())
		);
		weeeeeee();
		melahirkan();
		jalan();
	}
}
