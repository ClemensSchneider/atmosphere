/*
 * Copyright 2011 Jeanfrancois Arcand
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.atmosphere.cpr;

/**
 * This interface contains all Atmosphere headers shared between the client and the server.
 *
 * @author Jeanfrancois Arcand
 */
public interface HeaderConfig {
    /**
     * The current transport used.
     */
    String X_ATMOSPHERE_TRANSPORT = "X-Atmosphere-Transport";

    String LONG_POLLING_TRANSPORT = "long-polling";

    String STREAMING_TRANSPORT = "streaming";

    String WEBSOCKET_TRANSPORT = "websocket";
    /**
     * When a unexpected error occurs.
     */
    String X_ATMOSPHERE_ERROR = "X-Atmosphere-error";
    /**
     * The unique tracking ID generated by the client
     */
    String X_ATMOSPHERE_TRACKING_ID = "X-Atmosphere-tracking-id";
    /**
     * The current version of Atmosphere Framework
     */
    String X_ATMOSPHERE_FRAMEWORK = "X-Atmosphere-Framework";
    /**
     * The current time
     */
    String X_CACHE_DATE = "X-Cache-Date";

    String X_ATMOSPHERE = "X-Atmosphere";
    /**
     * The message size sent by Atmosphere
     */
    String X_ATMOSPHERE_TRACKMESSAGESIZE = "X-Atmosphere-TrackMessageSize";

    String ACCESS_CONTROL_ALLOW_ORIGIN = "Access-Control-Allow-Origin";

    String ACCESS_CONTROL_ALLOW_CREDENTIALS = "Access-Control-Allow-Credentials";

    String PRAGMA = "Pragma";

    String CACHE_CONTROL = "Cache-Control";

    String EXPIRES = "Expires";

    String WEBSOCKET_UPGRADE = "Upgrade";
}
