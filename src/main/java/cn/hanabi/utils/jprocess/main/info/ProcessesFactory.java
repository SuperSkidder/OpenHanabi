/*
 * Copyright 2016 Javier Garcia Alonso.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.hanabi.utils.jprocess.main.info;

import cn.hanabi.utils.jprocess.main.util.OSDetector;

/**
 * Factory class to get the right information for the OS
 *
 * @author Javier Garcia Alonso
 */
public class ProcessesFactory {

    //Hide constructor
    private ProcessesFactory() {
    }

    //use getShape method to get object of type shape
    public static ProcessesService getService() {
        if (OSDetector.isWindows()) {
            return new WindowsProcessesService();
        } else if (OSDetector.isUnix()) {
            return new UnixProcessesService();
        }

        throw new UnsupportedOperationException("Your Operating System is not supported by this library.");
    }
}
