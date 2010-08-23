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
//package plugin;
//
//
//// now the plugin needs to implement the outputFileReady() method and also register its interest in this event
//class MyPlugin implements APTEventListener {
//
//    public MyPlugin() {
//        APTApp apt = new APTApp(); // then register interest
//
//        apt.addAPTEventListener(this);  //where this the plugin object
//
////        APTApp a = new APTApp();
////
////        a.addAPTListener(this); //this is the same as self
//
//// finally, you need to have code in the APT application that maintains a list of listeners and calls the outputFileReady event.
//
//// let's assume that the application has some variable that refers to the outputPath, let's call it outputPath.
//
//// in the declarations for the applicaiton
//
//    }
//
//    public void outputFileReady(APTEvent e) {
//
//        String fileName = e.getOutputPath();
//
//// .... now you implement your code to load the file into Cytosacpe,    set attribute values, etc.
//
//
//
//// then in the body of the code you need to register your interest in the event
//
//// let's assume that you have been passed a reference to the APT applicaation when you startaed it up
//
//    }
//}
//
//  
