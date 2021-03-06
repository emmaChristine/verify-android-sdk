/*
 * Copyright (c) 2015 Nexmo Inc
 * All rights reserved.
 *
 * Licensed only under the Nexmo Verify SDK License Agreement located at
 *
 * https://www.nexmo.com/terms-use/verify-sdk/ (the “License”)
 *
 * You may not use, exercise any rights with respect to or exploit this SDK,
 * or any modifications or derivative works thereof, except in accordance
 * with the License.
 */

package com.nexmo.sdk.verify.client;

/**
* Generic internal error.
* An error has occurred in the Nexmo platform whilst processing a request.
*/
public class InternalNetworkException extends Exception {

    /**
     * Constructs a new InternalNetworkException that includes the current stack trace.
     */
    public InternalNetworkException() {
    }

    /**
     * Constructs a new InternalNetworkException with the current stack trace and the specified detail message.
     *
     * @param message The detail message for this exception. Accepts null.
     */
    public InternalNetworkException(String message) {
        super(message);
    }

    /**
     * Constructs a new InternalNetworkException with the current stack trace, the specified detail message and the specified cause.
     *
     * @param message   The detail message for this exception. Accepts null.
     * @param throwable The cause of this exception.
     */
    public InternalNetworkException(String message, Throwable throwable) {
        super(message, throwable);
    }

    /**
     * Constructs a new InternalNetworkException with the current stack trace and the specified cause.
     *
     * @param throwable The cause of this exception.
     */
    public InternalNetworkException(Throwable throwable) {
        super(throwable);
    }

}