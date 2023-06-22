class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class coding_ninja_problem_04{
    public static ListNode removeNthFromEnd(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        // Move the fast pointer k+1 steps ahead
        for (int i = 0; i <= k; i++) {
            if (fast == null) {
                return head; // Edge case: k is greater than the list size
            }
            fast = fast.next;
        }

        // Move both pointers until the fast pointer reaches the end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Delete the kth node from the end
        slow.next = slow.next.next;

        return dummy.next;
    }

    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 2; // Remove the 2nd node from the end

        ListNode result = removeNthFromEnd(head, k);

        // Print the resulting linked list
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
