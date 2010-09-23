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
package test;

import data.FileLocator;
import downloader.Downloader;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * ZIP compressed file extraction utility class
 * @author Anurag Sharma
 */
@SuppressWarnings("all")
public class MyZipExtractor {

    /**
     * extracts the ZIP compressed file
     * @param gzippedFile the ZIP compressed file
     * @param outputDir the directory where the uncompressed file is to be placed
     * @return the uncompressed file
     */
    public static File extract(File gzippedFile, String outputDir) {
        File outputFile = null;
        try {
            ZipInputStream gis = new ZipInputStream(new FileInputStream(gzippedFile));
            BufferedInputStream in = new BufferedInputStream(gis);
            ZipEntry entry = gis.getNextEntry();
            while (entry != null) {
                String outputFileName = entry.getName();// gzippedFile.getName();
//            outputFileName = outputFileName.replace(".gz", "");
                outputFile = new File(outputDir + "/" + outputFileName);
                if (entry.isDirectory()) {
                    outputFile.mkdir();
                } else {
                    BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(outputFile));

                    byte[] buffer = new byte[1024];
                    int d = 0;

                    while ((d = in.read(buffer)) != -1) {
                        out.write(buffer, 0, d);
                    }
                    out.close();
                    outputFile.setExecutable(true);
                    gis.closeEntry();
                }
                entry = gis.getNextEntry();
            }
            in.close();         //close ZipStream

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return outputFile;
    }

    public static void main(String[] args) throws MalformedURLException, IOException {
//        //just for testing
//        Downloader d=new Downloader();
//        d.download("http://localhost/RAE230B.zip");
//        d.waitFor();
//        File zipFile=d.getOutputFile();
//        File output = extract(zipFile,FileLocator.home_dir);
//        System.out.println("file extracted to " + output.getAbsolutePath());

        java.util.Properties properties = System.getProperties();
        properties.list(System.out);
    }
}
