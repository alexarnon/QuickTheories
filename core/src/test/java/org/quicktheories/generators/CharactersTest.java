package org.quicktheories.generators;

import static org.quicktheories.impl.GenAssert.assertThatGenerator;

import org.junit.Test;
import org.quicktheories.core.Gen;
import org.quicktheories.generators.Generate;

public class CharactersTest {

  private static final int BASIC_LATIN_LAST_CODEPOINT = 0x007E;
  private static final int BASIC_LATIN_FIRST_CODEPOINT = 0x0020;


  @Test
  public void shouldShrinkTowardsExclaimationCharacter() {
    Gen<Character> testee = Generate
        .characters(BASIC_LATIN_FIRST_CODEPOINT, BASIC_LATIN_LAST_CODEPOINT);
    assertThatGenerator(testee).shrinksTowards('!');
  }


}
