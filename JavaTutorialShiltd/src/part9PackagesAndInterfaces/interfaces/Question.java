/**
 * 
 */
package part9PackagesAndInterfaces.interfaces;

import java.util.Random;

/**
 * @author Shiltd
 *
 */
class Question implements SharedConstants {

	Random rand = new Random();

	int ask() {
		int prob = (int) (100 * rand.nextDouble());
		if (prob < 30)
			return NO;
		if (prob < 60)
			return YES;
		if (prob < 75)
			return LATER;
		if (prob < 98)
			return SOON;
		else
			return NEVER;
	}
}
