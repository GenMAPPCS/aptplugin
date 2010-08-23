/*******************************************************************************
 * Copyright 2010 Alexander Pico
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import data.FileLocator;
import downloader.Downloader;
import extractor.ZipExtractor;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

/**
 *
 * @author Anurag Sharma, the user
 */
public class TempClass {

    public static void main(String[] args) throws MalformedURLException, IOException {
        Downloader d = new Downloader();
        d.download("http://localhost/test.zip");
        d.waitFor();
        File file = d.getOutputFile();
        if (file.exists()) {
            System.out.println("File Downloaded ...");
            ZipExtractor e = new ZipExtractor();
            e.extract(d.getOutputFile(), FileLocator.home_dir);
            System.out.println("DONE--");
        }
    }
}
