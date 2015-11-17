package cn.oge.airgap.kks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KKS_XTD_02 {

	// 小天都2号机组
	public static String[] KKS_IN = { //
	/*----*/"EB751HP2MKA01MK016BL01J1CA004CA01", // +X
			"EB751HP2MKA01MK016BN01J1CA004CA01", // +Y
			"EB751HP2MKA01MK016BR01J1CA004CA01", // -X
			"EB751HP2MKA01MK016BS01J1CA004CA01", // -Y
	};
	
	public static String KKS_IN_STR = toStr(KKS_IN);

	private static String toStr(String[] array) {
		StringBuffer sbStr = new StringBuffer();
		for (int i = 0; i < array.length; i++) {
			sbStr.append(",").append(array[i]);
		}
		return sbStr.substring(1);
	}
	// 输出量-平均气隙
	private static String[] kks1 = {
	/*----*/"EB001HP0MKA01MK016BL01J2CA004AA01", "EB001HP0MKA01MK016BM01J2CA004AA01",
			"EB001HP0MKA01MK016BN01J2CA004AA01", "EB001HP0MKA01MK016BP01J2CA004AA01",
			"EB001HP0MKA01MK016BR01J2CA004AA01", "EB001HP0MKA01MK016BQ01J2CA004AA01",
			"EB001HP0MKA01MK016BS01J2CA004AA01", "EB001HP0MKA01MK016BT01J2CA004AA01" };

	// 输出量-最大气隙
	private static String[] kks2 = {
	/*----*/"EB001HP0MKA01MK016BL01J2CA004AA02", "EB001HP0MKA01MK016BM01J2CA004AA02",
			"EB001HP0MKA01MK016BN01J2CA004AA02", "EB001HP0MKA01MK016BP01J2CA004AA02",
			"EB001HP0MKA01MK016BR01J2CA004AA02", "EB001HP0MKA01MK016BQ01J2CA004AA02",
			"EB001HP0MKA01MK016BS01J2CA004AA02", "EB001HP0MKA01MK016BT01J2CA004AA02" };

	// 输出量-最小气隙
	private static String[] kks3 = {
	/*----*/"EB001HP0MKA01MK016BL01J2CA004AA03", "EB001HP0MKA01MK016BM01J2CA004AA03",
			"EB001HP0MKA01MK016BN01J2CA004AA03", "EB001HP0MKA01MK016BP01J2CA004AA03",
			"EB001HP0MKA01MK016BR01J2CA004AA03", "EB001HP0MKA01MK016BQ01J2CA004AA03",
			"EB001HP0MKA01MK016BS01J2CA004AA03", "EB001HP0MKA01MK016BT01J2CA004AA03" };

	// 输出量-定转子距离偏差
	private static String[] kks4 = {
	/*----*/"EB001HP0MKA01MK016BL01J2CA004AA08", "EB001HP0MKA01MK016BM01J2CA004AA08",
			"EB001HP0MKA01MK016BN01J2CA004AA08", "EB001HP0MKA01MK016BP01J2CA004AA08",
			"EB001HP0MKA01MK016BR01J2CA004AA08", "EB001HP0MKA01MK016BQ01J2CA004AA08",
			"EB001HP0MKA01MK016BS01J2CA004AA08", "EB001HP0MKA01MK016BT01J2CA004AA08" };

	// 输出量-不圆度
	private static String[] kks5 = {
	/*----*/"EB001HP0MKB01MK002ZZ01J2CA004BC01", "EB001HP0MKB01MK007ZZ01J2CA004BC01" };

	// 磁极伸长偏差
	private static String[] polekks = {
	/*----*/"EB001HP0MKB01MK214ZZ01J2CA006AA08", "EB001HP0MKB01MK215ZZ01J2CA006AA08",
			"EB001HP0MKB01MK216ZZ01J2CA006AA08", "EB001HP0MKB01MK217ZZ01J2CA006AA08",
			"EB001HP0MKB01MK218ZZ01J2CA006AA08", "EB001HP0MKB01MK219ZZ01J2CA006AA08",
			"EB001HP0MKB01MK220ZZ01J2CA006AA08", "EB001HP0MKB01MK221ZZ01J2CA006AA08",
			"EB001HP0MKB01MK222ZZ01J2CA006AA08", "EB001HP0MKB01MK223ZZ01J2CA006AA08",
			"EB001HP0MKB01MK224ZZ01J2CA006AA08", "EB001HP0MKB01MK225ZZ01J2CA006AA08",
			"EB001HP0MKB01MK226ZZ01J2CA006AA08", "EB001HP0MKB01MK227ZZ01J2CA006AA08",
			"EB001HP0MKB01MK228ZZ01J2CA006AA08", "EB001HP0MKB01MK229ZZ01J2CA006AA08",
			"EB001HP0MKB01MK230ZZ01J2CA006AA08", "EB001HP0MKB01MK231ZZ01J2CA006AA08",
			"EB001HP0MKB01MK232ZZ01J2CA006AA08", "EB001HP0MKB01MK233ZZ01J2CA006AA08",
			"EB001HP0MKB01MK234ZZ01J2CA006AA08", "EB001HP0MKB01MK235ZZ01J2CA006AA08",
			"EB001HP0MKB01MK236ZZ01J2CA006AA08", "EB001HP0MKB01MK237ZZ01J2CA006AA08",
			"EB001HP0MKB01MK238ZZ01J2CA006AA08", "EB001HP0MKB01MK239ZZ01J2CA006AA08",
			"EB001HP0MKB01MK240ZZ01J2CA006AA08", "EB001HP0MKB01MK241ZZ01J2CA006AA08",
			"EB001HP0MKB01MK242ZZ01J2CA006AA08", "EB001HP0MKB01MK243ZZ01J2CA006AA08",
			"EB001HP0MKB01MK244ZZ01J2CA006AA08", "EB001HP0MKB01MK245ZZ01J2CA006AA08",
			"EB001HP0MKB01MK246ZZ01J2CA006AA08", "EB001HP0MKB01MK247ZZ01J2CA006AA08",
			"EB001HP0MKB01MK248ZZ01J2CA006AA08", "EB001HP0MKB01MK249ZZ01J2CA006AA08",
			"EB001HP0MKB01MK250ZZ01J2CA006AA08", "EB001HP0MKB01MK251ZZ01J2CA006AA08",
			"EB001HP0MKB01MK252ZZ01J2CA006AA08", "EB001HP0MKB01MK253ZZ01J2CA006AA08",
			"EB001HP0MKB01MK254ZZ01J2CA006AA08", "EB001HP0MKB01MK255ZZ01J2CA006AA08",
			"EB001HP0MKB01MK256ZZ01J2CA006AA08", "EB001HP0MKB01MK257ZZ01J2CA006AA08",
			"EB001HP0MKB01MK258ZZ01J2CA006AA08", "EB001HP0MKB01MK259ZZ01J2CA006AA08",
			"EB001HP0MKB01MK260ZZ01J2CA006AA08", "EB001HP0MKB01MK261ZZ01J2CA006AA08",
			"EB001HP0MKB01MK262ZZ01J2CA006AA08", "EB001HP0MKB01MK263ZZ01J2CA006AA08",
			"EB001HP0MKB01MK264ZZ01J2CA006AA08", "EB001HP0MKB01MK265ZZ01J2CA006AA08",
			"EB001HP0MKB01MK266ZZ01J2CA006AA08", "EB001HP0MKB01MK267ZZ01J2CA006AA08",
			"EB001HP0MKB01MK268ZZ01J2CA006AA08", "EB001HP0MKB01MK269ZZ01J2CA006AA08",
			"EB001HP0MKB01MK270ZZ01J2CA006AA08", "EB001HP0MKB01MK271ZZ01J2CA006AA08",
			"EB001HP0MKB01MK272ZZ01J2CA006AA08", "EB001HP0MKB01MK273ZZ01J2CA006AA08",
			"EB001HP0MKB01MK274ZZ01J2CA006AA08", "EB001HP0MKB01MK275ZZ01J2CA006AA08",
			"EB001HP0MKB01MK276ZZ01J2CA006AA08", "EB001HP0MKB01MK277ZZ01J2CA006AA08",
			"EB001HP0MKB01MK278ZZ01J2CA006AA08", "EB001HP0MKB01MK279ZZ01J2CA006AA08",
			"EB001HP0MKB01MK280ZZ01J2CA006AA08", "EB001HP0MKB01MK281ZZ01J2CA006AA08",
			"EB001HP0MKB01MK282ZZ01J2CA006AA08", "EB001HP0MKB01MK283ZZ01J2CA006AA08",
			"EB001HP0MKB01MK284ZZ01J2CA006AA08", "EB001HP0MKB01MK285ZZ01J2CA006AA08",
			"EB001HP0MKB01MK286ZZ01J2CA006AA08", "EB001HP0MKB01MK287ZZ01J2CA006AA08",
			"EB001HP0MKB01MK288ZZ01J2CA006AA08", "EB001HP0MKB01MK289ZZ01J2CA006AA08",
			"EB001HP0MKB01MK290ZZ01J2CA006AA08", "EB001HP0MKB01MK291ZZ01J2CA006AA08",
			"EB001HP0MKB01MK292ZZ01J2CA006AA08", "EB001HP0MKB01MK293ZZ01J2CA006AA08",
			"EB001HP0MKB01MK294ZZ01J2CA006AA08", "EB001HP0MKB01MK295ZZ01J2CA006AA08",
			"EB001HP0MKB01MK296ZZ01J2CA006AA08", "EB001HP0MKB01MK297ZZ01J2CA006AA08",
			"EB001HP0MKB01MK298ZZ01J2CA006AA08", "EB001HP0MKB01MK299ZZ01J2CA006AA08",
			"EB001HP0MKB01MK300ZZ01J2CA006AA08", "EB001HP0MKB01MK301ZZ01J2CA006AA08",
			"EB001HP0MKB01MK302ZZ01J2CA006AA08", "EB001HP0MKB01MK303ZZ01J2CA006AA08" };

	public static List<String> KKS_OUT = getOutKks();

	private static List<String> getOutKks() {

		List<String> outkks = new ArrayList<String>();
		outkks.addAll(Arrays.asList(kks1));
		outkks.addAll(Arrays.asList(kks2));
		outkks.addAll(Arrays.asList(kks3));
		outkks.addAll(Arrays.asList(kks4));
		outkks.addAll(Arrays.asList(kks5));
		outkks.addAll(Arrays.asList(polekks));

		return outkks;
	}
}
