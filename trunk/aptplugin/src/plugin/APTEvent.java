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
package plugin;

// first, in the application, you need to have an event class, let's call it APTEvent
public class APTEvent {
// the event object can be used to communicate in this case we just want to know
//    when output file is ready

    private String outputPath; //location of the output directory
    private int exitStatus = FAILURE;
    public static final int SUCCESS = 0;
    public static final int FAILURE = 1;

    public APTEvent(String outputPath, int exitStatus) {
        this.exitStatus = exitStatus;
        this.outputPath = outputPath;
    }

    /**
     * Returns the output directory's absolute path
     * @return the output directory's absolute path
     */
    public String getOutputPath() {
        return outputPath;
    }

    public int getExitStatus() {
        return exitStatus;
    }

    public boolean isOutputReady() {
        return (exitStatus == SUCCESS);
    }
}
// that's it for the APTEvent class

