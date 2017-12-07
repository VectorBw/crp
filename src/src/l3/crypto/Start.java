package src.l3.crypto;

import java.math.BigInteger;

public class Start {


	public static void main(String ... args) {
		
		Crypter c = new Crypter(); // Generation de tous les parametres (p, q, n, e, d);
		
		BigInteger p = new BigInteger("1");
		BigInteger q = new BigInteger("3");
		
		Crypter c1 = new Crypter(p,q); // Generation de e et d
		
		BigInteger e = new BigInteger("49");
		BigInteger n = new BigInteger("323");
		BigInteger phi = new BigInteger("288");
		
		Crypter c2 = new Crypter(e,n,phi, true); // Generation de d
		
		BigInteger d = new BigInteger("241");
		
		Crypter c3 = new Crypter(e,n,d, false); // aucune g閚閞ation (exemple : vous avez deja g閚閞�calcul�les parametres
		
		
		System.out.println("====== C =====");
		System.out.println(c);
		System.out.println();
		
		System.out.println("====== C1 =====");
		System.out.println(c1);
		System.out.println();
		
		System.out.println("====== C2 =====");
		System.out.println(c2);
		System.out.println();
		
		System.out.println("====== C3 =====");
		System.out.println(c3);
		System.out.println();
		
		
		BigInteger x = new BigInteger("11");
		
		BigInteger y = c.Crypt(x, e, n);  //Crypter un nombre
		
		BigInteger z = c3.Decrypt(y);
		
		System.out.println(x + " chiffr�est " + y);
		System.out.println(y + " dechiffr�est " + z);
	
	}
	

}
