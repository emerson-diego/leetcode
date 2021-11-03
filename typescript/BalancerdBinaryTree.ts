export class BalancerdBinaryTree {
  public isBalanced(root: TreeNode): boolean {
    if (root == null) return true;

    if (Math.abs(this.height(root.left) - this.height(root.right)) > 1)
      return false;
    else return this.isBalanced(root.left) && this.isBalanced(root.right);
  }

  private height(root: TreeNode): number {
    if (root == null) return 0;
    return Math.max(this.height(root.left), this.height(root.right)) + 1;
  }
}

class TreeNode {
  val: number;
  left: TreeNode;
  right: TreeNode;

  /*constructor() {}

  constructor(val: number) {
    this.val = val;
  }*/

  constructor(val: number, left?: TreeNode, right?: TreeNode) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}
