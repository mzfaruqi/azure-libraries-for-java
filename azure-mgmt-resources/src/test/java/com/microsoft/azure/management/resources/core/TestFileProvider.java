/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.resources.core;

import com.microsoft.azure.management.resources.fluentcore.utils.FileProvider;

import java.io.File;
import java.io.IOException;

/**
 *
 */
public class TestFileProvider extends FileProvider {

    private boolean isRecordMode;

    /**
     * Constructor.
     * @param isRecordMode whether test case is in recording mode.
     */
    public TestFileProvider(boolean isRecordMode) {
        this.isRecordMode = isRecordMode;
    }

    @Override
    public void prepareFileLocation(File file) throws IOException {
        if (isRecordMode) {
            // delete existing file so new file can be recorded during recording.
            file.delete();
        }
        super.prepareFileLocation(file);
    }
}
