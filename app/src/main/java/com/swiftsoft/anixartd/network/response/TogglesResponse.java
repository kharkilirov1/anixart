package com.swiftsoft.anixartd.network.response;

import com.swiftsoft.anixartd.network.Response;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: TogglesResponse.kt */
@Metadata(m31883d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b2\n\u0002\u0010\b\n\u0002\b8\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001a\u0010$\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u001a\u0010'\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001a\u0010*\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR\u001a\u0010-\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR\u001a\u00100\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001b\"\u0004\b2\u0010\u001dR\u001a\u00103\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\bR\u001a\u00106\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0006\"\u0004\b8\u0010\bR\u001a\u00109\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0006\"\u0004\b;\u0010\bR\u001a\u0010<\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u001b\"\u0004\b>\u0010\u001dR\u001a\u0010?\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\f\"\u0004\bA\u0010\u000eR\u001a\u0010B\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u001b\"\u0004\bD\u0010\u001dR\u001a\u0010E\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u001b\"\u0004\bG\u0010\u001dR\u001a\u0010H\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0006\"\u0004\bJ\u0010\bR\u001a\u0010K\u001a\u00020LX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001a\u0010Q\u001a\u00020LX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010N\"\u0004\bS\u0010PR\u001a\u0010T\u001a\u00020LX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010N\"\u0004\bV\u0010PR\u001a\u0010W\u001a\u00020LX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010N\"\u0004\bY\u0010PR\u001a\u0010Z\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\u001b\"\u0004\b\\\u0010\u001dR\u001a\u0010]\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010\u0006\"\u0004\b_\u0010\bR\u001a\u0010`\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010\u0006\"\u0004\bb\u0010\bR\u001a\u0010c\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010\u001b\"\u0004\be\u0010\u001dR\u001a\u0010f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010\u0006\"\u0004\bh\u0010\bR\u001a\u0010i\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u0010\u0006\"\u0004\bk\u0010\bR\u001a\u0010l\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bm\u0010\u001b\"\u0004\bn\u0010\u001dR\u001a\u0010o\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bp\u0010\u0006\"\u0004\bq\u0010\bR\u001a\u0010r\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bs\u0010\u001b\"\u0004\bt\u0010\u001dR\u001a\u0010u\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bv\u0010\u001b\"\u0004\bw\u0010\u001dR\u001a\u0010x\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\by\u0010\u001b\"\u0004\bz\u0010\u001dR\u001a\u0010{\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b|\u0010\u0006\"\u0004\b}\u0010\bR\u001b\u0010~\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000f\n\u0000\u001a\u0004\b\u007f\u0010\u0006\"\u0005\b\u0080\u0001\u0010\bR\u001d\u0010\u0081\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0082\u0001\u0010\u0006\"\u0005\b\u0083\u0001\u0010\b¨\u0006\u0084\u0001"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/response/TogglesResponse;", "Lcom/swiftsoft/anixartd/network/Response;", "()V", "adBannerBlockId", "", "getAdBannerBlockId", "()Ljava/lang/String;", "setAdBannerBlockId", "(Ljava/lang/String;)V", "adBannerDelay", "", "getAdBannerDelay", "()J", "setAdBannerDelay", "(J)V", "adBannerSizeType", "getAdBannerSizeType", "setAdBannerSizeType", "adInterstitialBlockId", "getAdInterstitialBlockId", "setAdInterstitialBlockId", "adInterstitialDelay", "getAdInterstitialDelay", "setAdInterstitialDelay", "apiAltAvailable", "", "getApiAltAvailable", "()Z", "setApiAltAvailable", "(Z)V", "apiAltUrl", "getApiAltUrl", "setApiAltUrl", "apiUrl", "getApiUrl", "setApiUrl", "downloadLink", "getDownloadLink", "setDownloadLink", "gpDownloadLink", "getGpDownloadLink", "setGpDownloadLink", "gpWhatsNew", "getGpWhatsNew", "setGpWhatsNew", "impMessageBackgroundColor", "getImpMessageBackgroundColor", "setImpMessageBackgroundColor", "impMessageEnabled", "getImpMessageEnabled", "setImpMessageEnabled", "impMessageLink", "getImpMessageLink", "setImpMessageLink", "impMessageText", "getImpMessageText", "setImpMessageText", "impMessageTextColor", "getImpMessageTextColor", "setImpMessageTextColor", "inAppUpdates", "getInAppUpdates", "setInAppUpdates", "inAppUpdatesFlexibleDelay", "getInAppUpdatesFlexibleDelay", "setInAppUpdatesFlexibleDelay", "inAppUpdatesImmediate", "getInAppUpdatesImmediate", "setInAppUpdatesImmediate", "kodikIframeAd", "getKodikIframeAd", "setKodikIframeAd", "kodikVideoLinksUrl", "getKodikVideoLinksUrl", "setKodikVideoLinksUrl", "lastGPVersionCode", "", "getLastGPVersionCode", "()I", "setLastGPVersionCode", "(I)V", "lastVersionCode", "getLastVersionCode", "setLastVersionCode", "minGPVersionCode", "getMinGPVersionCode", "setMinGPVersionCode", "minVersionCode", "getMinVersionCode", "setMinVersionCode", "overrideGPVersion", "getOverrideGPVersion", "setOverrideGPVersion", "pageNoConnectionUrl", "getPageNoConnectionUrl", "setPageNoConnectionUrl", "searchBarIconAction", "getSearchBarIconAction", "setSearchBarIconAction", "searchBarIconTint", "getSearchBarIconTint", "setSearchBarIconTint", "searchBarIconUrl", "getSearchBarIconUrl", "setSearchBarIconUrl", "searchBarIconValue", "getSearchBarIconValue", "setSearchBarIconValue", "sibnetRandUserAgent", "getSibnetRandUserAgent", "setSibnetRandUserAgent", "sibnetUserAgent", "getSibnetUserAgent", "setSibnetUserAgent", "snowfall", "getSnowfall", "setSnowfall", "sponsorshipAvailable", "getSponsorshipAvailable", "setSponsorshipAvailable", "sponsorshipPromotion", "getSponsorshipPromotion", "setSponsorshipPromotion", "sponsorshipText", "getSponsorshipText", "setSponsorshipText", "torlookUrl", "getTorlookUrl", "setTorlookUrl", "whatsNew", "getWhatsNew", "setWhatsNew", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class TogglesResponse extends Response {
    private long adBannerDelay;
    private long adBannerSizeType;
    private long adInterstitialDelay;
    private boolean apiAltAvailable;
    private boolean impMessageEnabled;
    private boolean inAppUpdates;
    private long inAppUpdatesFlexibleDelay;
    private boolean inAppUpdatesImmediate;
    private boolean kodikIframeAd;
    private int lastGPVersionCode;
    private int lastVersionCode;
    private int minGPVersionCode;
    private int minVersionCode;
    private boolean overrideGPVersion;
    private boolean sibnetRandUserAgent;
    private boolean snowfall;
    private boolean sponsorshipAvailable;
    private boolean sponsorshipPromotion;

    @NotNull
    private String whatsNew = "";

    @NotNull
    private String downloadLink = "";

    @NotNull
    private String gpWhatsNew = "";

    @NotNull
    private String gpDownloadLink = "";

    @NotNull
    private String impMessageText = "";

    @NotNull
    private String impMessageBackgroundColor = "";

    @NotNull
    private String impMessageTextColor = "";

    @NotNull
    private String impMessageLink = "";

    @NotNull
    private String adBannerBlockId = "";

    @NotNull
    private String adInterstitialBlockId = "";

    @NotNull
    private String kodikVideoLinksUrl = "";

    @NotNull
    private String sibnetUserAgent = "";

    @NotNull
    private String torlookUrl = "";

    @NotNull
    private String apiUrl = "";

    @NotNull
    private String apiAltUrl = "";

    @NotNull
    private String sponsorshipText = "";

    @NotNull
    private String pageNoConnectionUrl = "";

    @NotNull
    private String searchBarIconUrl = "";
    private boolean searchBarIconTint = true;

    @NotNull
    private String searchBarIconAction = "";

    @NotNull
    private String searchBarIconValue = "";

    @NotNull
    public final String getAdBannerBlockId() {
        return this.adBannerBlockId;
    }

    public final long getAdBannerDelay() {
        return this.adBannerDelay;
    }

    public final long getAdBannerSizeType() {
        return this.adBannerSizeType;
    }

    @NotNull
    public final String getAdInterstitialBlockId() {
        return this.adInterstitialBlockId;
    }

    public final long getAdInterstitialDelay() {
        return this.adInterstitialDelay;
    }

    public final boolean getApiAltAvailable() {
        return this.apiAltAvailable;
    }

    @NotNull
    public final String getApiAltUrl() {
        return this.apiAltUrl;
    }

    @NotNull
    public final String getApiUrl() {
        return this.apiUrl;
    }

    @NotNull
    public final String getDownloadLink() {
        return this.downloadLink;
    }

    @NotNull
    public final String getGpDownloadLink() {
        return this.gpDownloadLink;
    }

    @NotNull
    public final String getGpWhatsNew() {
        return this.gpWhatsNew;
    }

    @NotNull
    public final String getImpMessageBackgroundColor() {
        return this.impMessageBackgroundColor;
    }

    public final boolean getImpMessageEnabled() {
        return this.impMessageEnabled;
    }

    @NotNull
    public final String getImpMessageLink() {
        return this.impMessageLink;
    }

    @NotNull
    public final String getImpMessageText() {
        return this.impMessageText;
    }

    @NotNull
    public final String getImpMessageTextColor() {
        return this.impMessageTextColor;
    }

    public final boolean getInAppUpdates() {
        return this.inAppUpdates;
    }

    public final long getInAppUpdatesFlexibleDelay() {
        return this.inAppUpdatesFlexibleDelay;
    }

    public final boolean getInAppUpdatesImmediate() {
        return this.inAppUpdatesImmediate;
    }

    public final boolean getKodikIframeAd() {
        return this.kodikIframeAd;
    }

    @NotNull
    public final String getKodikVideoLinksUrl() {
        return this.kodikVideoLinksUrl;
    }

    public final int getLastGPVersionCode() {
        return this.lastGPVersionCode;
    }

    public final int getLastVersionCode() {
        return this.lastVersionCode;
    }

    public final int getMinGPVersionCode() {
        return this.minGPVersionCode;
    }

    public final int getMinVersionCode() {
        return this.minVersionCode;
    }

    public final boolean getOverrideGPVersion() {
        return this.overrideGPVersion;
    }

    @NotNull
    public final String getPageNoConnectionUrl() {
        return this.pageNoConnectionUrl;
    }

    @NotNull
    public final String getSearchBarIconAction() {
        return this.searchBarIconAction;
    }

    public final boolean getSearchBarIconTint() {
        return this.searchBarIconTint;
    }

    @NotNull
    public final String getSearchBarIconUrl() {
        return this.searchBarIconUrl;
    }

    @NotNull
    public final String getSearchBarIconValue() {
        return this.searchBarIconValue;
    }

    public final boolean getSibnetRandUserAgent() {
        return this.sibnetRandUserAgent;
    }

    @NotNull
    public final String getSibnetUserAgent() {
        return this.sibnetUserAgent;
    }

    public final boolean getSnowfall() {
        return this.snowfall;
    }

    public final boolean getSponsorshipAvailable() {
        return this.sponsorshipAvailable;
    }

    public final boolean getSponsorshipPromotion() {
        return this.sponsorshipPromotion;
    }

    @NotNull
    public final String getSponsorshipText() {
        return this.sponsorshipText;
    }

    @NotNull
    public final String getTorlookUrl() {
        return this.torlookUrl;
    }

    @NotNull
    public final String getWhatsNew() {
        return this.whatsNew;
    }

    public final void setAdBannerBlockId(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.adBannerBlockId = str;
    }

    public final void setAdBannerDelay(long j2) {
        this.adBannerDelay = j2;
    }

    public final void setAdBannerSizeType(long j2) {
        this.adBannerSizeType = j2;
    }

    public final void setAdInterstitialBlockId(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.adInterstitialBlockId = str;
    }

    public final void setAdInterstitialDelay(long j2) {
        this.adInterstitialDelay = j2;
    }

    public final void setApiAltAvailable(boolean z) {
        this.apiAltAvailable = z;
    }

    public final void setApiAltUrl(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.apiAltUrl = str;
    }

    public final void setApiUrl(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.apiUrl = str;
    }

    public final void setDownloadLink(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.downloadLink = str;
    }

    public final void setGpDownloadLink(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.gpDownloadLink = str;
    }

    public final void setGpWhatsNew(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.gpWhatsNew = str;
    }

    public final void setImpMessageBackgroundColor(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.impMessageBackgroundColor = str;
    }

    public final void setImpMessageEnabled(boolean z) {
        this.impMessageEnabled = z;
    }

    public final void setImpMessageLink(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.impMessageLink = str;
    }

    public final void setImpMessageText(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.impMessageText = str;
    }

    public final void setImpMessageTextColor(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.impMessageTextColor = str;
    }

    public final void setInAppUpdates(boolean z) {
        this.inAppUpdates = z;
    }

    public final void setInAppUpdatesFlexibleDelay(long j2) {
        this.inAppUpdatesFlexibleDelay = j2;
    }

    public final void setInAppUpdatesImmediate(boolean z) {
        this.inAppUpdatesImmediate = z;
    }

    public final void setKodikIframeAd(boolean z) {
        this.kodikIframeAd = z;
    }

    public final void setKodikVideoLinksUrl(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.kodikVideoLinksUrl = str;
    }

    public final void setLastGPVersionCode(int i2) {
        this.lastGPVersionCode = i2;
    }

    public final void setLastVersionCode(int i2) {
        this.lastVersionCode = i2;
    }

    public final void setMinGPVersionCode(int i2) {
        this.minGPVersionCode = i2;
    }

    public final void setMinVersionCode(int i2) {
        this.minVersionCode = i2;
    }

    public final void setOverrideGPVersion(boolean z) {
        this.overrideGPVersion = z;
    }

    public final void setPageNoConnectionUrl(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.pageNoConnectionUrl = str;
    }

    public final void setSearchBarIconAction(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.searchBarIconAction = str;
    }

    public final void setSearchBarIconTint(boolean z) {
        this.searchBarIconTint = z;
    }

    public final void setSearchBarIconUrl(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.searchBarIconUrl = str;
    }

    public final void setSearchBarIconValue(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.searchBarIconValue = str;
    }

    public final void setSibnetRandUserAgent(boolean z) {
        this.sibnetRandUserAgent = z;
    }

    public final void setSibnetUserAgent(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.sibnetUserAgent = str;
    }

    public final void setSnowfall(boolean z) {
        this.snowfall = z;
    }

    public final void setSponsorshipAvailable(boolean z) {
        this.sponsorshipAvailable = z;
    }

    public final void setSponsorshipPromotion(boolean z) {
        this.sponsorshipPromotion = z;
    }

    public final void setSponsorshipText(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.sponsorshipText = str;
    }

    public final void setTorlookUrl(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.torlookUrl = str;
    }

    public final void setWhatsNew(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.whatsNew = str;
    }
}
