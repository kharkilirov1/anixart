package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible
/* loaded from: classes.dex */
public enum RemovalCause {
    EXPLICIT { // from class: com.google.common.cache.RemovalCause.1
        @Override // com.google.common.cache.RemovalCause
        /* renamed from: a */
        public boolean mo11320a() {
            return false;
        }
    },
    REPLACED { // from class: com.google.common.cache.RemovalCause.2
        @Override // com.google.common.cache.RemovalCause
        /* renamed from: a */
        public boolean mo11320a() {
            return false;
        }
    },
    COLLECTED { // from class: com.google.common.cache.RemovalCause.3
        @Override // com.google.common.cache.RemovalCause
        /* renamed from: a */
        public boolean mo11320a() {
            return true;
        }
    },
    EXPIRED { // from class: com.google.common.cache.RemovalCause.4
        @Override // com.google.common.cache.RemovalCause
        /* renamed from: a */
        public boolean mo11320a() {
            return true;
        }
    },
    SIZE { // from class: com.google.common.cache.RemovalCause.5
        @Override // com.google.common.cache.RemovalCause
        /* renamed from: a */
        public boolean mo11320a() {
            return true;
        }
    };

    RemovalCause(C16071 c16071) {
    }

    /* renamed from: a */
    public abstract boolean mo11320a();
}
