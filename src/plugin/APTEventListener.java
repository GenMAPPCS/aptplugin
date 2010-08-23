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

// next we need an APTEventListener Interface, also defined in the application

// it defines the callback methods on the object that is listening for this APTEvent.
// in this case we just want to listen for the output file being ready and do something when it is
// one method is defined outputFileReady() and each listener imiplements this method in its own way
public interface APTEventListener {
    void outputFileReady(APTEvent e);
}

