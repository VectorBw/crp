package src.l3.crypto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Crypter {
	
	private BigInteger _p;
	private BigInteger _q;
	
	private BigInteger _e;
	private BigInteger _d;
	private BigInteger _n;
	
	private BigInteger _phi;
	
	public Crypter() {
		
		try {
			_p = getRandomPrime();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		_q = new BigInteger("0");
		
		while (_q.equals(BigInteger.ZERO) || _q.equals(_p)) {
			try {
				_q = getRandomPrime();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
				
		_n = _p.multiply(_q);
		_phi = _p.add(new BigInteger("-1")).multiply( _q.add(new BigInteger("-1")));
		
		generateE();
		
		BigInteger[] bezou = PrimeExtendedEuclid(_e, _phi,true);
		_d = bezou[0];
	}

	public Crypter(BigInteger e, BigInteger n, BigInteger integer, boolean calculateD) {

		_e = e;
		_n = n;
		
		if (calculateD) {
			_phi = integer;
			
			BigInteger[] bezou = PrimeExtendedEuclid(_e,_phi,true);
			_d = bezou[0];
		}
		
		else {
			_d = integer;
		}
	
	}
	
	public Crypter(BigInteger p, BigInteger q) {
		_p = p;
		_q = q;
		_n = _p.multiply(_q);
		_phi = _p.add(new BigInteger("-1")).multiply( _q.add(new BigInteger("-1")));

		generateE();
		
		BigInteger[] bezou = PrimeExtendedEuclid(_e,_phi,true);
		_d = bezou[0];
	}

	
	public BigInteger getPhi() {
		return _phi;
	}
	
	private void generateE() {
		try {
			_e = getRandomPrime();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	public BigInteger Crypt(BigInteger x, BigInteger e, BigInteger n) {
		return x.modPow(e, n);
	}
	
	public BigInteger Decrypt(BigInteger y) {
		return y.modPow(_d, _n);
	}
	
	public BigInteger getN() {
		return _n;
	}
	
	public BigInteger getE() {
		return _e;
	}
	
	public BigInteger getD() {
		return _d;
	}
	
	public BigInteger getRandomPrime() throws IOException {
		ArrayList<String> primes = new ArrayList<String>();
		
		String path = "/l3/crypto/primes/primes.txt";

		BufferedReader input = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(path)));

		String line;
		while ((line = input.readLine()) != null) {
		  	String[] split = line.split(" ");
		  	for (String str : split) {
		  		if (str.length() > 0) {
		  			primes.add(str);
		  		}
		  	}
		}
		input.close();
		
		int rand = ThreadLocalRandom.current().nextInt(0, primes.size() + 1);
		
		return new BigInteger(primes.get(rand));
	}
	
	private BigInteger[] PrimeExtendedEuclid(BigInteger x, BigInteger y, boolean positive_u) {
		
		BigInteger u = new BigInteger("1");
		
		BigInteger v = new BigInteger("0");
		
		BigInteger u1 = new BigInteger("0");
		BigInteger v1 = new BigInteger("1");
		
		BigInteger a = x;
		BigInteger b = y;
		
		BigInteger q = new BigInteger("0");

		while (!b.equals(BigInteger.ZERO)) {

		  q = a.divide(b);
		  	
		  BigInteger m = a.mod(b);
		  		
		  a = b;
		  b = m;
		  
		  BigInteger u3 = u.add(q.multiply(u1).negate());
		  BigInteger v3 = v.add(q.multiply(v1).negate());

		  u = u1;
		  u1 = u3;
		  
		  v = v1;
		  v1 = v3;
		}	
		
		if (positive_u && u.signum() != 1) {
			while (u.signum() != 1) {
				u = u.add(y);
				v = v.add(y.negate());
			}
		}
		
		BigInteger result[] = new BigInteger[2];
		result[0] = u;
		result[1] = v;
		return result;
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("p = " + _p);
		str.append("\n");
		str.append("q = " + _q);
		str.append("\n");
		str.append("n = " + _n);
		str.append("\n");
		str.append("e = " + _e);
		str.append("\n");
		str.append("d = " + _d);
		str.append("\n");
		str.append("phi = " + _phi);
		
		
		return str.toString();
	}
}
