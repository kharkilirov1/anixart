package com.google.common.reflect;

import com.google.common.annotations.Beta;
import com.google.common.base.Predicate;
import com.google.common.base.Splitter;
import java.util.Objects;
import java.util.logging.Logger;

@Beta
/* loaded from: classes2.dex */
public final class ClassPath {

    /* renamed from: com.google.common.reflect.ClassPath$1 */
    class C19171 implements Predicate<ClassInfo> {
        @Override // com.google.common.base.Predicate
        public boolean apply(ClassInfo classInfo) {
            Objects.requireNonNull(classInfo);
            throw null;
        }
    }

    @Beta
    public static final class ClassInfo extends ResourceInfo {
        @Override // com.google.common.reflect.ClassPath.ResourceInfo
        public String toString() {
            return null;
        }
    }

    public static final class LocationInfo {
        public boolean equals(Object obj) {
            if (!(obj instanceof LocationInfo)) {
                return false;
            }
            Objects.requireNonNull((LocationInfo) obj);
            throw null;
        }

        public int hashCode() {
            throw null;
        }

        public String toString() {
            throw null;
        }
    }

    @Beta
    public static class ResourceInfo {
        public boolean equals(Object obj) {
            if (!(obj instanceof ResourceInfo)) {
                return false;
            }
            Objects.requireNonNull((ResourceInfo) obj);
            throw null;
        }

        public int hashCode() {
            throw null;
        }

        public String toString() {
            return null;
        }
    }

    static {
        Logger.getLogger(ClassPath.class.getName());
        Splitter.m11205b(" ");
    }
}
