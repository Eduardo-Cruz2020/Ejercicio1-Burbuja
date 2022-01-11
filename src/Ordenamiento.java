
public class Ordenamiento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] lista = {1,2,8,44,9,26,3,7,33,1,93,417,19,27,14,11,30,4};

		burbuja(lista);
		
	}
	
	
	// Algoritmo de ordenamiento de la burbuja
	public static void burbuja(int[] A) {
        int i, j, aux;
        for (i = 0; i < A.length - 1; i++) {
            for (j = 0; j < A.length - i - 1; j++) {
                if (A[j + 1] < A[j]) {
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
            }
        }
        // Imprimime la lista de numeros
        for (int k = 0; k < A.length; k++)
            System.out.println(A[k]);

	}

}
