/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.fmod;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Type</h3>
 * 
 * <pre><code>
 * FMOD_RESULT (*{@link #invoke}) (
 *     FMOD_DSP *dsp,
 *     FMOD_DSP_CALLBACK_TYPE type,
 *     void *data
 * )</code></pre>
 */
public abstract class FMOD_DSP_CALLBACK extends Callback implements FMOD_DSP_CALLBACKI {

    /**
     * Creates a {@code FMOD_DSP_CALLBACK} instance from the specified function pointer.
     *
     * @return the new {@code FMOD_DSP_CALLBACK}
     */
    public static FMOD_DSP_CALLBACK create(long functionPointer) {
        FMOD_DSP_CALLBACKI instance = Callback.get(functionPointer);
        return instance instanceof FMOD_DSP_CALLBACK
            ? (FMOD_DSP_CALLBACK)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static FMOD_DSP_CALLBACK createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code FMOD_DSP_CALLBACK} instance that delegates to the specified {@code FMOD_DSP_CALLBACKI} instance. */
    public static FMOD_DSP_CALLBACK create(FMOD_DSP_CALLBACKI instance) {
        return instance instanceof FMOD_DSP_CALLBACK
            ? (FMOD_DSP_CALLBACK)instance
            : new Container(instance.address(), instance);
    }

    protected FMOD_DSP_CALLBACK() {
        super(CIF);
    }

    FMOD_DSP_CALLBACK(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends FMOD_DSP_CALLBACK {

        private final FMOD_DSP_CALLBACKI delegate;

        Container(long functionPointer, FMOD_DSP_CALLBACKI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long dsp, int type, long data) {
            return delegate.invoke(dsp, type, data);
        }

    }

}