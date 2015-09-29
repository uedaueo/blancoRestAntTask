/*
 * blanco Framework
 * Copyright (C) 2004-2005 IGA Tosiki
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 */
package blanco.rest.task;

import java.io.IOException;

import blanco.rest.task.valueobject.BlancoRestProcessInput;

public class BlancoRestProcessImpl implements
        BlancoRestProcess {

    /**
     * {@inheritDoc}
     */
    public int execute(final BlancoRestProcessInput input)
            throws IOException, IllegalArgumentException {
        System.out.println(input.getMetadir());

        return BlancoRestBatchProcess.END_SUCCESS;
    }

    /**
     * {@inheritDoc}
     */
    public boolean progress(final String argProgressMessage) {
        System.out.println(argProgressMessage);
        return false;
    }
}
