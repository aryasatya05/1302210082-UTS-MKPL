package lib;

public class TaxFunction {
	private static final int TAX_RATE = 5;
	private static final int TAX_FREE_INCOME_SINGLE = 54000000;
  private static final int TAX_FREE_INCOME_MARRIED = 58500000;
  private static final int TAX_FREE_INCOME_CHILD = 4500000;
  private static final int MAX_CHILDREN_ALLOWANCE = 3;
	
	/**
	 * Fungsi untuk menghitung jumlah pajak penghasilan pegawai yang harus dibayarkan setahun.
	 * 
	 * Pajak dihitung sebagai 5% dari penghasilan bersih tahunan (gaji dan pemasukan bulanan lainnya dikalikan jumlah bulan bekerja dikurangi pemotongan) dikurangi penghasilan tidak kena pajak.
	 * 
	 * Jika pegawai belum menikah dan belum punya anak maka penghasilan tidak kena pajaknya adalah Rp 54.000.000.
	 * Jika pegawai sudah menikah maka penghasilan tidak kena pajaknya ditambah sebesar Rp 4.500.000.
	 * Jika pegawai sudah memiliki anak maka penghasilan tidak kena pajaknya ditambah sebesar Rp 4.500.000 per anak sampai anak ketiga.
	 * 
	 */
	
	
	public static int calculateTax(int monthlySalary, int otherMonthlyIncome, int numberOfMonthWorking, int deductible, boolean isMarried, int numberOfChildren) {
		int taxFreeIncome = isMarried ? TAX_FREE_INCOME_MARRIED : TAX_FREE_INCOME_SINGLE;
		int childAllowance = Math.min(numberOfChildren, MAX_CHILDREN_ALLOWANCE) * TAX_FREE_INCOME_PER_CHILD;

		int totalIncome = (monthlySalary + otherMonthlyIncome) * numberOfMonthWorking;
    int taxableIncome = totalIncome - deductible - taxFreeIncome - childAllowance;

    return Math.max(0, tax);
	}
	
}
