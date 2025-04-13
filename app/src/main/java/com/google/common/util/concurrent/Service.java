package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.DoNotMock;

@DoNotMock
@GwtIncompatible
/* loaded from: classes2.dex */
public interface Service {

    public static abstract class Listener {
    }

    public enum State {
        NEW { // from class: com.google.common.util.concurrent.Service.State.1
        },
        STARTING { // from class: com.google.common.util.concurrent.Service.State.2
        },
        RUNNING { // from class: com.google.common.util.concurrent.Service.State.3
        },
        STOPPING { // from class: com.google.common.util.concurrent.Service.State.4
        },
        TERMINATED { // from class: com.google.common.util.concurrent.Service.State.5
        },
        FAILED { // from class: com.google.common.util.concurrent.Service.State.6
        };

        State(C20221 c20221) {
        }
    }

    /* renamed from: a */
    State mo12136a();
}
