package data.dto.coin


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class USDX(
    @SerialName("CHANGE24HOUR")
    val cHANGE24HOUR: Double?,
    @SerialName("CHANGEDAY")
    val cHANGEDAY: Double?,
    @SerialName("CHANGEHOUR")
    val cHANGEHOUR: Double?,
    @SerialName("CHANGEPCT24HOUR")
    val cHANGEPCT24HOUR: Double?,
    @SerialName("CHANGEPCTDAY")
    val cHANGEPCTDAY: Double?,
    @SerialName("CHANGEPCTHOUR")
    val cHANGEPCTHOUR: Double?,
    @SerialName("CIRCULATINGSUPPLY")
    val cIRCULATINGSUPPLY: Double?,
    @SerialName("CIRCULATINGSUPPLYMKTCAP")
    val cIRCULATINGSUPPLYMKTCAP: Double?,
    @SerialName("CONVERSIONLASTUPDATE")
    val cONVERSIONLASTUPDATE: Int?,
    @SerialName("CONVERSIONSYMBOL")
    val cONVERSIONSYMBOL: String?,
    @SerialName("CONVERSIONTYPE")
    val cONVERSIONTYPE: String?,
    @SerialName("FLAGS")
    val fLAGS: String?,
    @SerialName("FROMSYMBOL")
    val fROMSYMBOL: String?,
    @SerialName("HIGH24HOUR")
    val hIGH24HOUR: Double?,
    @SerialName("HIGHDAY")
    val hIGHDAY: Double?,
    @SerialName("HIGHHOUR")
    val hIGHHOUR: Double?,
    @SerialName("IMAGEURL")
    val iMAGEURL: String?,
    @SerialName("LASTMARKET")
    val lASTMARKET: String?,
    @SerialName("LASTTRADEID")
    val lASTTRADEID: String?,
    @SerialName("LASTUPDATE")
    val lASTUPDATE: Int?,
    @SerialName("LASTVOLUME")
    val lASTVOLUME: Double?,
    @SerialName("LASTVOLUMETO")
    val lASTVOLUMETO: Double?,
    @SerialName("LOW24HOUR")
    val lOW24HOUR: Double?,
    @SerialName("LOWDAY")
    val lOWDAY: Double?,
    @SerialName("LOWHOUR")
    val lOWHOUR: Double?,
    @SerialName("MARKET")
    val mARKET: String?,
    @SerialName("MEDIAN")
    val mEDIAN: Double?,
    @SerialName("MKTCAP")
    val mKTCAP: Double?,
    @SerialName("MKTCAPPENALTY")
    val mKTCAPPENALTY: Int?,
    @SerialName("OPEN24HOUR")
    val oPEN24HOUR: Double?,
    @SerialName("OPENDAY")
    val oPENDAY: Double?,
    @SerialName("OPENHOUR")
    val oPENHOUR: Double?,
    @SerialName("PRICE")
    val pRICE: Double?,
    @SerialName("SUPPLY")
    val sUPPLY: Double?,
    @SerialName("TOPTIERVOLUME24HOUR")
    val tOPTIERVOLUME24HOUR: Double?,
    @SerialName("TOPTIERVOLUME24HOURTO")
    val tOPTIERVOLUME24HOURTO: Double?,
    @SerialName("TOSYMBOL")
    val tOSYMBOL: String?,
    @SerialName("TOTALTOPTIERVOLUME24H")
    val tOTALTOPTIERVOLUME24H: Double?,
    @SerialName("TOTALTOPTIERVOLUME24HTO")
    val tOTALTOPTIERVOLUME24HTO: Double?,
    @SerialName("TOTALVOLUME24H")
    val tOTALVOLUME24H: Double?,
    @SerialName("TOTALVOLUME24HTO")
    val tOTALVOLUME24HTO: Double?,
    @SerialName("TYPE")
    val tYPE: String?,
    @SerialName("VOLUME24HOUR")
    val vOLUME24HOUR: Double?,
    @SerialName("VOLUME24HOURTO")
    val vOLUME24HOURTO: Double?,
    @SerialName("VOLUMEDAY")
    val vOLUMEDAY: Double?,
    @SerialName("VOLUMEDAYTO")
    val vOLUMEDAYTO: Double?,
    @SerialName("VOLUMEHOUR")
    val vOLUMEHOUR: Double?,
    @SerialName("VOLUMEHOURTO")
    val vOLUMEHOURTO: Double?
)