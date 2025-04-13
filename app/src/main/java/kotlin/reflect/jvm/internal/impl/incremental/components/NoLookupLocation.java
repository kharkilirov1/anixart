package kotlin.reflect.jvm.internal.impl.incremental.components;

import org.jetbrains.annotations.Nullable;

/* compiled from: LookupLocation.kt */
/* loaded from: classes3.dex */
public enum NoLookupLocation implements LookupLocation {
    /* JADX INFO: Fake field, exist only in values array */
    FROM_IDE,
    FROM_BACKEND,
    /* JADX INFO: Fake field, exist only in values array */
    FROM_TEST,
    FROM_BUILTINS,
    /* JADX INFO: Fake field, exist only in values array */
    WHEN_CHECK_DECLARATION_CONFLICTS,
    /* JADX INFO: Fake field, exist only in values array */
    WHEN_CHECK_OVERRIDES,
    /* JADX INFO: Fake field, exist only in values array */
    FOR_SCRIPT,
    FROM_REFLECTION,
    /* JADX INFO: Fake field, exist only in values array */
    WHEN_RESOLVE_DECLARATION,
    /* JADX INFO: Fake field, exist only in values array */
    WHEN_GET_DECLARATION_SCOPE,
    /* JADX INFO: Fake field, exist only in values array */
    WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS,
    FOR_ALREADY_TRACKED,
    WHEN_GET_ALL_DESCRIPTORS,
    /* JADX INFO: Fake field, exist only in values array */
    WHEN_TYPING,
    WHEN_GET_SUPER_MEMBERS,
    FOR_NON_TRACKED_SCOPE,
    /* JADX INFO: Fake field, exist only in values array */
    FROM_SYNTHETIC_SCOPE,
    FROM_DESERIALIZATION,
    FROM_JAVA_LOADER,
    /* JADX INFO: Fake field, exist only in values array */
    WHEN_GET_LOCAL_VARIABLE,
    /* JADX INFO: Fake field, exist only in values array */
    WHEN_FIND_BY_FQNAME,
    /* JADX INFO: Fake field, exist only in values array */
    WHEN_GET_COMPANION_OBJECT,
    /* JADX INFO: Fake field, exist only in values array */
    FOR_DEFAULT_IMPORTS;

    @Override // kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation
    @Nullable
    /* renamed from: a */
    public LocationInfo mo32662a() {
        return null;
    }
}
