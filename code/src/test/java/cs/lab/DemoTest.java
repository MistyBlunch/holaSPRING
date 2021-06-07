//package cs.lab;
//
//import org.json.simple.parser.ParseException;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import java.io.IOException;
//import java.util.logging.Logger;
//
//public class DemoTest {
//	static class Demo {
//		private static final Logger logger = Logger.getLogger(Demo.class.getName());
//
//		public String[] results(int numTest) throws IOException, ParseException {
//			Twitch testCase = new Twitch(FILE);
//			String[] res = testCase.getTestCase(numTest);
//
//			return new String[]{res[1], translator.translate("es", "en", res[0])};
//		}
//
//		// Normal TestCase
//		@Test
//		 public void NormalCase() throws ParseException, IOException {
//			String[] res_ = results(5);
//
//			Assert.assertEquals(res_[0], res_[1]);
//		}
//
//		// Concurrency TestCase
//		@Test(invocationCount = INV_COUNT, threadPoolSize = POOL_SIZ)
//		public void LimitCase() throws IOException, ParseException {
//			String[] res = results(3);
//
//			Assert.assertEquals(res[0], res[1]);
//		}
//
//		// Time TestCase
//		@Test
//		public void TimeCase() throws Exception {
//			Twitch testCase = new Twitch(FILE);
//			String []res = testCase.getTestCase(5);
//			long beginTime = System.currentTimeMillis();
//
//			translator.translate("es", "en", res[0]);
//
//			long finalTime = System.currentTimeMillis();
//			long executionTime = finalTime - beginTime;
//
//			logger.info("************ Execution Time ***************** " + String.valueOf(executionTime));
//			Assert.assertTrue(executionTime < (long) MAX_TIME);
//		}
//
//		// Long TestCase
//		@Test
//		public void LongTextCase() throws IOException, ParseException {
//			Twitch testCase = new Twitch(FILE);
//			String[] res = testCase.getTestCase(6);
//
//			translator.translate("es", "en", res[0]);
//
//			Assert.assertFalse(res[0].length() < LONG_TEXT_LIMIT);
//		}
//
//		// No JSON TestCase
//		@Test
//		public void NoJSONCase() throws IOException, ParseException {
//			Twitch testCase = new Twitch(FILE);
//			String[] res = testCase.getTestCase(8);
//
//			Assert.assertEquals(res[0], "");
//		}
//
//		// useTranslate TestCase
//		@Test
//		public void useTranslateCase() throws IOException, ParseException {
//			Twitch testCase = new Twitch(FILE);
//			String[] res = testCase.getTestCase(2);
//			String result = translator.useTranslate(res[0]);
//
//			Assert.assertNotEquals(result, "");
//		}
//
//		// Main TesCase
//		@Test
//		public void MainCaseWithArgs() throws Exception {
//			Twitch testCase = new Twitch(FILE);
//			String[] res = testCase.getTestCase(2);
//
//			CSTranslator.main(new String[] {res[0]});
//		}
//
//		@Test
//		public void MainCaseWithoutArgs() throws Exception {
//			CSTranslator.main(new String[] {});
//		}
//	}
//}
