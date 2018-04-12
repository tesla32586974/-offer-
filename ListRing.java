package algorithm;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;


public class ListRing {
	public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if(pHead == null || pHead.next == null || pHead.next.next == null)
        	return null;
        ListNode pFast = pHead.next.next;
        ListNode pSlow = pHead.next;
        while(pFast != pSlow ){
        	if(pFast == pSlow){
        		break;
        	}
        	if(pSlow.next == null || pFast.next.next == null)
        		return null;
        	else{
        		pSlow = pSlow.next;
        		pFast = pFast.next.next;
        	}
        }
        pFast = pHead;
        while(pFast != pSlow){
        	pFast = pFast.next;
        	pSlow = pSlow.next;
        }
        return pFast;
    }
}
