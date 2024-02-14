package data.dto.coin


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CoinAsUsd(
    @SerialName("CHANGE24HOUR")
    val cHANGE24HOUR: String?,
    @SerialName("CHANGEDAY")
    val cHANGEDAY: String?,
    @SerialName("CHANGEHOUR")
    val cHANGEHOUR: String?,
    @SerialName("CHANGEPCT24HOUR")
    val cHANGEPCT24HOUR: String?,
    @SerialName("CHANGEPCTDAY")
    val cHANGEPCTDAY: String?,
    @SerialName("CHANGEPCTHOUR")
    val cHANGEPCTHOUR: String?,
    @SerialName("CIRCULATINGSUPPLY")
    val cIRCULATINGSUPPLY: String?,
    @SerialName("CIRCULATINGSUPPLYMKTCAP")
    val cIRCULATINGSUPPLYMKTCAP: String?,
    @SerialName("CONVERSIONLASTUPDATE")
    val cONVERSIONLASTUPDATE: String?,
    @SerialName("CONVERSIONSYMBOL")
    val cONVERSIONSYMBOL: String?,
    @SerialName("CONVERSIONTYPE")
    val cONVERSIONTYPE: String?,
    @SerialName("FROMSYMBOL")
    val fROMSYMBOL: String?,
    @SerialName("HIGH24HOUR")
    val hIGH24HOUR: String?,
    @SerialName("HIGHDAY")
    val hIGHDAY: String?,
    @SerialName("HIGHHOUR")
    val hIGHHOUR: String?,
    @SerialName("IMAGEURL")
    val iMAGEURL: String?,
    @SerialName("LASTMARKET")
    val lASTMARKET: String?,
    @SerialName("LASTTRADEID")
    val lASTTRADEID: String?,
    @SerialName("LASTUPDATE")
    val lASTUPDATE: String?,
    @SerialName("LASTVOLUME")
    val lASTVOLUME: String?,
    @SerialName("LASTVOLUMETO")
    val lASTVOLUMETO: String?,
    @SerialName("LOW24HOUR")
    val lOW24HOUR: String?,
    @SerialName("LOWDAY")
    val lOWDAY: String?,
    @SerialName("LOWHOUR")
    val lOWHOUR: String?,
    @SerialName("MARKET")
    val mARKET: String?,
    @SerialName("MKTCAP")
    val mKTCAP: String?,
    @SerialName("MKTCAPPENALTY")
    val mKTCAPPENALTY: String?,
    @SerialName("OPEN24HOUR")
    val oPEN24HOUR: String?,
    @SerialName("OPENDAY")
    val oPENDAY: String?,
    @SerialName("OPENHOUR")
    val oPENHOUR: String?,
    @SerialName("PRICE")
    val pRICE: String?,
    @SerialName("SUPPLY")
    val sUPPLY: String?,
    @SerialName("TOPTIERVOLUME24HOUR")
    val tOPTIERVOLUME24HOUR: String?,
    @SerialName("TOPTIERVOLUME24HOURTO")
    val tOPTIERVOLUME24HOURTO: String?,
    @SerialName("TOSYMBOL")
    val tOSYMBOL: String?,
    @SerialName("TOTALTOPTIERVOLUME24H")
    val tOTALTOPTIERVOLUME24H: String?,
    @SerialName("TOTALTOPTIERVOLUME24HTO")
    val tOTALTOPTIERVOLUME24HTO: String?,
    @SerialName("TOTALVOLUME24H")
    val tOTALVOLUME24H: String?,
    @SerialName("TOTALVOLUME24HTO")
    val tOTALVOLUME24HTO: String?,
    @SerialName("VOLUME24HOUR")
    val vOLUME24HOUR: String?,
    @SerialName("VOLUME24HOURTO")
    val vOLUME24HOURTO: String?,
    @SerialName("VOLUMEDAY")
    val vOLUMEDAY: String?,
    @SerialName("VOLUMEDAYTO")
    val vOLUMEDAYTO: String?,
    @SerialName("VOLUMEHOUR")
    val vOLUMEHOUR: String?,
    @SerialName("VOLUMEHOURTO")
    val vOLUMEHOURTO: String?
)