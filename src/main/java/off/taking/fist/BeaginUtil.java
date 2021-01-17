package off.taking.fist;

import org.apache.commons.lang.StringUtils;

/**
 * @author Administrator
 * 2021年1月17日下午3:46:34
 */
public class BeaginUtil
{

	public void begin(String str) {
		System.out.println(StringUtils.defaultIfBlank(str, "this is default begin run."));
	}
}
