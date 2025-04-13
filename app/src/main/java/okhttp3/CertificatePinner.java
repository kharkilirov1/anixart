package okhttp3;

import androidx.room.util.C0576a;
import com.fasterxml.jackson.core.JsonPointer;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.tls.CertificateChainCleaner;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: CertificatePinner.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \"2\u00020\u0001:\u0003!\"#B!\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J)\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011H\u0000¢\u0006\u0002\b\u0014J)\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00170\u0016\"\u00020\u0017H\u0007¢\u0006\u0002\u0010\u0018J\u001c\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0012J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0015\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006$"}, m31884d2 = {"Lokhttp3/CertificatePinner;", "", "pins", "", "Lokhttp3/CertificatePinner$Pin;", "certificateChainCleaner", "Lokhttp3/internal/tls/CertificateChainCleaner;", "(Ljava/util/Set;Lokhttp3/internal/tls/CertificateChainCleaner;)V", "getCertificateChainCleaner$okhttp", "()Lokhttp3/internal/tls/CertificateChainCleaner;", "getPins", "()Ljava/util/Set;", "check", "", "hostname", "", "cleanedPeerCertificatesFn", "Lkotlin/Function0;", "", "Ljava/security/cert/X509Certificate;", "check$okhttp", "peerCertificates", "", "Ljava/security/cert/Certificate;", "(Ljava/lang/String;[Ljava/security/cert/Certificate;)V", "equals", "", "other", "findMatchingPins", "hashCode", "", "withCertificateChainCleaner", "withCertificateChainCleaner$okhttp", "Builder", "Companion", "Pin", "okhttp"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class CertificatePinner {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final CertificatePinner DEFAULT = new Builder().build();

    @Nullable
    private final CertificateChainCleaner certificateChainCleaner;

    @NotNull
    private final Set<Pin> pins;

    /* compiled from: CertificatePinner.kt */
    @Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J'\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u000b\"\u00020\n¢\u0006\u0002\u0010\fJ\u0006\u0010\r\u001a\u00020\u000eR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m31884d2 = {"Lokhttp3/CertificatePinner$Builder;", "", "()V", "pins", "", "Lokhttp3/CertificatePinner$Pin;", "getPins", "()Ljava/util/List;", "add", "pattern", "", "", "(Ljava/lang/String;[Ljava/lang/String;)Lokhttp3/CertificatePinner$Builder;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lokhttp3/CertificatePinner;", "okhttp"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Builder {

        @NotNull
        private final List<Pin> pins = new ArrayList();

        @NotNull
        public final Builder add(@NotNull String pattern, @NotNull String... pins) {
            Intrinsics.m32179h(pattern, "pattern");
            Intrinsics.m32179h(pins, "pins");
            for (String str : pins) {
                this.pins.add(new Pin(pattern, str));
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final CertificatePinner build() {
            return new CertificatePinner(CollectionsKt.m32035n0(this.pins), null, 2, 0 == true ? 1 : 0);
        }

        @NotNull
        public final List<Pin> getPins() {
            return this.pins;
        }
    }

    /* compiled from: CertificatePinner.kt */
    @Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\f\u0010\t\u001a\u00020\n*\u00020\u000bH\u0007J\f\u0010\f\u001a\u00020\n*\u00020\u000bH\u0007R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m31884d2 = {"Lokhttp3/CertificatePinner$Companion;", "", "()V", "DEFAULT", "Lokhttp3/CertificatePinner;", "pin", "", "certificate", "Ljava/security/cert/Certificate;", "sha1Hash", "Lokio/ByteString;", "Ljava/security/cert/X509Certificate;", "sha256Hash", "okhttp"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final String pin(@NotNull Certificate certificate) {
            Intrinsics.m32179h(certificate, "certificate");
            if (!(certificate instanceof X509Certificate)) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
            }
            StringBuilder m24u = C0000a.m24u("sha256/");
            m24u.append(sha256Hash((X509Certificate) certificate).mo34574a());
            return m24u.toString();
        }

        @JvmStatic
        @NotNull
        public final ByteString sha1Hash(@NotNull X509Certificate sha1Hash) {
            Intrinsics.m32179h(sha1Hash, "$this$sha1Hash");
            ByteString.Companion companion = ByteString.f68753f;
            PublicKey publicKey = sha1Hash.getPublicKey();
            Intrinsics.m32178g(publicKey, "publicKey");
            byte[] encoded = publicKey.getEncoded();
            Intrinsics.m32178g(encoded, "publicKey.encoded");
            return ByteString.Companion.m34588e(companion, encoded, 0, 0, 3).m34582l();
        }

        @JvmStatic
        @NotNull
        public final ByteString sha256Hash(@NotNull X509Certificate sha256Hash) {
            Intrinsics.m32179h(sha256Hash, "$this$sha256Hash");
            ByteString.Companion companion = ByteString.f68753f;
            PublicKey publicKey = sha256Hash.getPublicKey();
            Intrinsics.m32178g(publicKey, "publicKey");
            byte[] encoded = publicKey.getEncoded();
            Intrinsics.m32178g(encoded, "publicKey.encoded");
            return ByteString.Companion.m34588e(companion, encoded, 0, 0, 3).mo34575b("SHA-256");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: CertificatePinner.kt */
    @Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0003J\b\u0010\u0018\u001a\u00020\u0003H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, m31884d2 = {"Lokhttp3/CertificatePinner$Pin;", "", "pattern", "", "pin", "(Ljava/lang/String;Ljava/lang/String;)V", "hash", "Lokio/ByteString;", "getHash", "()Lokio/ByteString;", "hashAlgorithm", "getHashAlgorithm", "()Ljava/lang/String;", "getPattern", "equals", "", "other", "hashCode", "", "matchesCertificate", "certificate", "Ljava/security/cert/X509Certificate;", "matchesHostname", "hostname", "toString", "okhttp"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Pin {

        @NotNull
        private final ByteString hash;

        @NotNull
        private final String hashAlgorithm;

        @NotNull
        private final String pattern;

        public Pin(@NotNull String pattern, @NotNull String pin) {
            Intrinsics.m32179h(pattern, "pattern");
            Intrinsics.m32179h(pin, "pin");
            if (!((StringsKt.m33898X(pattern, "*.", false, 2, null) && StringsKt.m33878D(pattern, "*", 1, false, 4, null) == -1) || (StringsKt.m33898X(pattern, "**.", false, 2, null) && StringsKt.m33878D(pattern, "*", 2, false, 4, null) == -1) || StringsKt.m33878D(pattern, "*", 0, false, 6, null) == -1)) {
                throw new IllegalArgumentException(C0000a.m14k("Unexpected pattern: ", pattern).toString());
            }
            String canonicalHost = HostnamesKt.toCanonicalHost(pattern);
            if (canonicalHost == null) {
                throw new IllegalArgumentException(C0000a.m14k("Invalid pattern: ", pattern));
            }
            this.pattern = canonicalHost;
            if (StringsKt.m33898X(pin, "sha1/", false, 2, null)) {
                this.hashAlgorithm = "sha1";
                ByteString.Companion companion = ByteString.f68753f;
                String substring = pin.substring(5);
                Intrinsics.m32178g(substring, "(this as java.lang.String).substring(startIndex)");
                ByteString m34589a = companion.m34589a(substring);
                if (m34589a == null) {
                    throw new IllegalArgumentException(C0000a.m14k("Invalid pin hash: ", pin));
                }
                this.hash = m34589a;
                return;
            }
            if (!StringsKt.m33898X(pin, "sha256/", false, 2, null)) {
                throw new IllegalArgumentException(C0000a.m14k("pins must start with 'sha256/' or 'sha1/': ", pin));
            }
            this.hashAlgorithm = "sha256";
            ByteString.Companion companion2 = ByteString.f68753f;
            String substring2 = pin.substring(7);
            Intrinsics.m32178g(substring2, "(this as java.lang.String).substring(startIndex)");
            ByteString m34589a2 = companion2.m34589a(substring2);
            if (m34589a2 == null) {
                throw new IllegalArgumentException(C0000a.m14k("Invalid pin hash: ", pin));
            }
            this.hash = m34589a2;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) other;
            return ((Intrinsics.m32174c(this.pattern, pin.pattern) ^ true) || (Intrinsics.m32174c(this.hashAlgorithm, pin.hashAlgorithm) ^ true) || (Intrinsics.m32174c(this.hash, pin.hash) ^ true)) ? false : true;
        }

        @NotNull
        public final ByteString getHash() {
            return this.hash;
        }

        @NotNull
        public final String getHashAlgorithm() {
            return this.hashAlgorithm;
        }

        @NotNull
        public final String getPattern() {
            return this.pattern;
        }

        public int hashCode() {
            return this.hash.hashCode() + C0576a.m4107f(this.hashAlgorithm, this.pattern.hashCode() * 31, 31);
        }

        public final boolean matchesCertificate(@NotNull X509Certificate certificate) {
            Intrinsics.m32179h(certificate, "certificate");
            String str = this.hashAlgorithm;
            int hashCode = str.hashCode();
            if (hashCode != -903629273) {
                if (hashCode == 3528965 && str.equals("sha1")) {
                    return Intrinsics.m32174c(this.hash, CertificatePinner.INSTANCE.sha1Hash(certificate));
                }
            } else if (str.equals("sha256")) {
                return Intrinsics.m32174c(this.hash, CertificatePinner.INSTANCE.sha256Hash(certificate));
            }
            return false;
        }

        public final boolean matchesHostname(@NotNull String hostname) {
            boolean m33930b;
            boolean m33930b2;
            Intrinsics.m32179h(hostname, "hostname");
            if (StringsKt.m33898X(this.pattern, "**.", false, 2, null)) {
                int length = this.pattern.length() - 3;
                int length2 = hostname.length() - length;
                m33930b2 = StringsKt__StringsJVMKt.m33930b(hostname, hostname.length() - length, this.pattern, 3, length, (r12 & 16) != 0 ? false : false);
                if (!m33930b2) {
                    return false;
                }
                if (length2 != 0 && hostname.charAt(length2 - 1) != '.') {
                    return false;
                }
            } else {
                if (!StringsKt.m33898X(this.pattern, "*.", false, 2, null)) {
                    return Intrinsics.m32174c(hostname, this.pattern);
                }
                int length3 = this.pattern.length() - 1;
                int length4 = hostname.length() - length3;
                m33930b = StringsKt__StringsJVMKt.m33930b(hostname, hostname.length() - length3, this.pattern, 1, length3, (r12 & 16) != 0 ? false : false);
                if (!m33930b || StringsKt.m33880F(hostname, '.', length4 - 1, false, 4, null) != -1) {
                    return false;
                }
            }
            return true;
        }

        @NotNull
        public String toString() {
            return this.hashAlgorithm + JsonPointer.SEPARATOR + this.hash.mo34574a();
        }
    }

    public CertificatePinner(@NotNull Set<Pin> pins, @Nullable CertificateChainCleaner certificateChainCleaner) {
        Intrinsics.m32179h(pins, "pins");
        this.pins = pins;
        this.certificateChainCleaner = certificateChainCleaner;
    }

    @JvmStatic
    @NotNull
    public static final String pin(@NotNull Certificate certificate) {
        return INSTANCE.pin(certificate);
    }

    @JvmStatic
    @NotNull
    public static final ByteString sha1Hash(@NotNull X509Certificate x509Certificate) {
        return INSTANCE.sha1Hash(x509Certificate);
    }

    @JvmStatic
    @NotNull
    public static final ByteString sha256Hash(@NotNull X509Certificate x509Certificate) {
        return INSTANCE.sha256Hash(x509Certificate);
    }

    public final void check(@NotNull final String hostname, @NotNull final List<? extends Certificate> peerCertificates) throws SSLPeerUnverifiedException {
        Intrinsics.m32179h(hostname, "hostname");
        Intrinsics.m32179h(peerCertificates, "peerCertificates");
        check$okhttp(hostname, new Function0<List<? extends X509Certificate>>() { // from class: okhttp3.CertificatePinner$check$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<? extends X509Certificate> invoke() {
                List<Certificate> list;
                CertificateChainCleaner certificateChainCleaner = CertificatePinner.this.getCertificateChainCleaner();
                if (certificateChainCleaner == null || (list = certificateChainCleaner.clean(peerCertificates, hostname)) == null) {
                    list = peerCertificates;
                }
                ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(list, 10));
                for (Certificate certificate : list) {
                    Objects.requireNonNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
            }
        });
    }

    public final void check$okhttp(@NotNull String hostname, @NotNull Function0<? extends List<? extends X509Certificate>> cleanedPeerCertificatesFn) {
        Intrinsics.m32179h(hostname, "hostname");
        Intrinsics.m32179h(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        List<Pin> findMatchingPins = findMatchingPins(hostname);
        if (findMatchingPins.isEmpty()) {
            return;
        }
        List<? extends X509Certificate> invoke = cleanedPeerCertificatesFn.invoke();
        for (X509Certificate x509Certificate : invoke) {
            ByteString byteString = null;
            ByteString byteString2 = null;
            for (Pin pin : findMatchingPins) {
                String hashAlgorithm = pin.getHashAlgorithm();
                int hashCode = hashAlgorithm.hashCode();
                if (hashCode != -903629273) {
                    if (hashCode == 3528965 && hashAlgorithm.equals("sha1")) {
                        if (byteString2 == null) {
                            byteString2 = INSTANCE.sha1Hash(x509Certificate);
                        }
                        if (Intrinsics.m32174c(pin.getHash(), byteString2)) {
                            return;
                        }
                    }
                    StringBuilder m24u = C0000a.m24u("unsupported hashAlgorithm: ");
                    m24u.append(pin.getHashAlgorithm());
                    throw new AssertionError(m24u.toString());
                }
                if (!hashAlgorithm.equals("sha256")) {
                    StringBuilder m24u2 = C0000a.m24u("unsupported hashAlgorithm: ");
                    m24u2.append(pin.getHashAlgorithm());
                    throw new AssertionError(m24u2.toString());
                }
                if (byteString == null) {
                    byteString = INSTANCE.sha256Hash(x509Certificate);
                }
                if (Intrinsics.m32174c(pin.getHash(), byteString)) {
                    return;
                }
            }
        }
        StringBuilder m27x = C0000a.m27x("Certificate pinning failure!", "\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : invoke) {
            m27x.append("\n    ");
            m27x.append(INSTANCE.pin(x509Certificate2));
            m27x.append(": ");
            Principal subjectDN = x509Certificate2.getSubjectDN();
            Intrinsics.m32178g(subjectDN, "element.subjectDN");
            m27x.append(subjectDN.getName());
        }
        m27x.append("\n  Pinned certificates for ");
        m27x.append(hostname);
        m27x.append(":");
        for (Pin pin2 : findMatchingPins) {
            m27x.append("\n    ");
            m27x.append(pin2);
        }
        String sb = m27x.toString();
        Intrinsics.m32178g(sb, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(sb);
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof CertificatePinner) {
            CertificatePinner certificatePinner = (CertificatePinner) other;
            if (Intrinsics.m32174c(certificatePinner.pins, this.pins) && Intrinsics.m32174c(certificatePinner.certificateChainCleaner, this.certificateChainCleaner)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final List<Pin> findMatchingPins(@NotNull String hostname) {
        Intrinsics.m32179h(hostname, "hostname");
        Set<Pin> set = this.pins;
        List list = EmptyList.f63144b;
        for (Object obj : set) {
            if (((Pin) obj).matchesHostname(hostname)) {
                if (list.isEmpty()) {
                    list = new ArrayList();
                }
                TypeIntrinsics.m32213b(list).add(obj);
            }
        }
        return list;
    }

    @Nullable
    /* renamed from: getCertificateChainCleaner$okhttp, reason: from getter */
    public final CertificateChainCleaner getCertificateChainCleaner() {
        return this.certificateChainCleaner;
    }

    @NotNull
    public final Set<Pin> getPins() {
        return this.pins;
    }

    public int hashCode() {
        int hashCode = (this.pins.hashCode() + 1517) * 41;
        CertificateChainCleaner certificateChainCleaner = this.certificateChainCleaner;
        return hashCode + (certificateChainCleaner != null ? certificateChainCleaner.hashCode() : 0);
    }

    @NotNull
    public final CertificatePinner withCertificateChainCleaner$okhttp(@NotNull CertificateChainCleaner certificateChainCleaner) {
        Intrinsics.m32179h(certificateChainCleaner, "certificateChainCleaner");
        return Intrinsics.m32174c(this.certificateChainCleaner, certificateChainCleaner) ? this : new CertificatePinner(this.pins, certificateChainCleaner);
    }

    public /* synthetic */ CertificatePinner(Set set, CertificateChainCleaner certificateChainCleaner, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, (i2 & 2) != 0 ? null : certificateChainCleaner);
    }

    @Deprecated
    public final void check(@NotNull String hostname, @NotNull Certificate... peerCertificates) throws SSLPeerUnverifiedException {
        Intrinsics.m32179h(hostname, "hostname");
        Intrinsics.m32179h(peerCertificates, "peerCertificates");
        check(hostname, ArraysKt.m31952b0(peerCertificates));
    }
}
