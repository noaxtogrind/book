/*
 * Copyright 2008-2011 Grant Ingersoll, Thomas Morton and Drew Farris
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 * -------------------
 * To purchase or learn more about Taming Text, by Grant Ingersoll, Thomas Morton and Drew Farris, visit
 * http://www.manning.com/ingersoll
 */

package com.tamingtext.opennlp;

import com.tamingtext.TamingTextTestJ4;
import opennlp.tools.lang.english.TreebankParser;
import opennlp.tools.parser.Parse;
import opennlp.tools.parser.Parser;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class ParserTest extends TamingTextTestJ4 {


  @Test
  public void test() throws IOException {

    File parserDir = getParserDir();
    //<start id="openParse"/>
    Parser parser = TreebankParser.getParser(parserDir.getAbsolutePath());
    Parse[] results = TreebankParser.parseLine("The Minnesota Twins , " +
            "the 1991 World Series Champions , are currently in third place .",
            parser, 3);
    for (int i = 0; i < results.length; i++) {
      results[i].show();
    }
    //<end id="openParse"/>
  }
}